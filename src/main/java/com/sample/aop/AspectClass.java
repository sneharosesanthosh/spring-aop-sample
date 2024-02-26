package com.sample.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j

public class AspectClass {


    @Around("execution(public void com.sample.aop.Car.displayCar())")
    public void aspectMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Aspect method called before");
        joinPoint.proceed();
        log.info("After PROCEED");
        log.info("Aspect method called after");
    }

    @After("execution(public void com.sample.aop.AopController.normalMethod())")
    public void aspectForControllerApi() {
        log.info("Controller api Aspect called AFTER");
    }
}
