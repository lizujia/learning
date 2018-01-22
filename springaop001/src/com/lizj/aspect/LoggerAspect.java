package com.lizj.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.lizj.annotation.Logger;

@Aspect
@Component
public class LoggerAspect {

    //@Around("@annotation(logger)")
    @Around("execution(* com.lizj.service.impl.IHello.say(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("-----before-----");
        joinPoint.proceed();
        System.out.println("-----after-----");
    }
    
}
