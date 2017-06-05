package com.lizj.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.lizj.annotation.Logger;

@Aspect
@Component
public class LoggerAspect {

    @Around("@annotation(logger)")
    public void log(ProceedingJoinPoint joinPoint, Logger logger) throws Throwable {
        System.out.println("-----before-----");
        joinPoint.proceed();
        System.out.println("-----after-----");
    }
    
}
