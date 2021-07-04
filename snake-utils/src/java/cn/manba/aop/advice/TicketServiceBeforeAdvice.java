package cn.manba.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * TicketServiceBeforeAdvice
 *
 * @author Geweilang
 * @date 2021-06-21
 */
public class TicketServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("BEFORE_ADVICE: 欢迎光临代售点....");
    }
}
