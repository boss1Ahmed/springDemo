package com.example.demoaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Aspect
@Configuration
public class AuditAspect {
    @Pointcut("execution(* com.example.demoaop.services.AccountService.accountHandler())")
    public void handlerMethods(){};

    @After("handlerMethods()")
    public void auditHandlers(JoinPoint joinPoint){
        System.out.println("before handling"+joinPoint.getSignature());
        throw new RuntimeException();
        //System.out.println("before handling"+joinPoint.getSignature());
    }
}
