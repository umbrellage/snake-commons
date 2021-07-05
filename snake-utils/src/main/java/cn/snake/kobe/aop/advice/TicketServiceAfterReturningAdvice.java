package cn.snake.kobe.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * TicketServiceAfterReturningAdvice
 *
 * @author Geweilang
 * @date 2021-06-21
 */
public class TicketServiceAfterReturningAdvice implements AfterReturningAdvice {


    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("AFTER_RETURNING：本次服务已结束....");
    }
}
