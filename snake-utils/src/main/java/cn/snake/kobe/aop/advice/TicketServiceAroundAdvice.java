package cn.snake.kobe.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * TicketServiceAroundAdvice
 *
 * @author Geweilang
 * @date 2021-06-21
 */
public class TicketServiceAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("AROUND_ADVICE:BEGIN....");
        Object returnValue = methodInvocation.proceed();
        System.out.println("AROUND_ADVICE:END.....");
        return returnValue;
    }
}
