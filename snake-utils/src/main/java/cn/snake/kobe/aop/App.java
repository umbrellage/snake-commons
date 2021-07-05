package cn.snake.kobe.aop;

import cn.snake.kobe.aop.advice.TicketServiceAfterReturningAdvice;
import cn.snake.kobe.aop.advice.TicketServiceAroundAdvice;
import cn.snake.kobe.aop.advice.TicketServiceBeforeAdvice;
import cn.snake.kobe.aop.advice.TicketServiceThrowsAdvice;
import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

import java.util.Optional;

/**
 * App
 *
 * @author Geweilang
 * @date 2021-06-21
 */
public class App {
    public static void main(String[] args) throws Exception {

        Thread.dumpStack();
        //1.针对不同的时期类型，提供不同的Advice
        Advice beforeAdvice = new TicketServiceBeforeAdvice();
        Advice afterReturningAdvice = new TicketServiceAfterReturningAdvice();
        Advice aroundAdvice = new TicketServiceAroundAdvice();
        Advice throwsAdvice = new TicketServiceThrowsAdvice();

        RailwayStationImpl railwayStation = new RailwayStationImpl();

        //2.创建ProxyFactoryBean,用以创建指定对象的Proxy对象
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        //3.设置Proxy的接口
        proxyFactoryBean.setInterfaces(TicketService.class);
        //4. 设置RealSubject
        proxyFactoryBean.setTarget(railwayStation);
        //5.使用JDK基于接口实现机制的动态代理生成Proxy代理对象，如果想使用CGLIB，需要将这个flag设置成true
        proxyFactoryBean.setProxyTargetClass(true);

        //6. 添加不同的Advice

        proxyFactoryBean.addAdvice(afterReturningAdvice);
        proxyFactoryBean.addAdvice(aroundAdvice);
        proxyFactoryBean.addAdvice(throwsAdvice);
        proxyFactoryBean.addAdvice(beforeAdvice);
        proxyFactoryBean.setProxyTargetClass(false);
        //7通过ProxyFactoryBean生成Proxy对象
        Optional<TicketService> ticketServiceOptional = Optional.ofNullable((TicketService) proxyFactoryBean.getObject());
        ticketServiceOptional.ifPresent(TicketService::sellTicket);
    }

}
