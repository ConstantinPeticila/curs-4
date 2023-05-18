package com.example.demo.aspecte;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class AddAfterMethodAspect {

//    public void afterReturn(JoinPoint joinPoint) throws Throwable {
//        log.info("s-a terminat de executat metoda {}", joinPoint.getSignature().getName());
//    }

    @After(value = "execution(* com.example.demo..*(..))")
    public void afterReturn(JoinPoint joinPoint) throws Throwable {
        log.info("s-a terminat de executat metoda {}", joinPoint.getSignature().getName());
    }

    @Before(value = "execution(* com.example.demo..*(..))")
    public void beforeExecution(JoinPoint joinPoint) throws Throwable {
        log.info("a inceput executia metodei {}", joinPoint.getSignature().getName());
    }

}
