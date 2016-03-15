package com.luxoft.spring.webapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("execution(public * *(..))")
    public void anyPublicMethod(){}

    @Pointcut("within(com.luxoft.spring.webapp..*)")
    public void withinApp(){}

    @Pointcut("anyPublicMethod() && withinApp()")
    public void anyPublicAppRepository(){}

    @Before("anyPublicAppRepository()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("before method: " + joinPoint.getSignature().getName());
    }
}
