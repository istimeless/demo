package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {

    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.example.demo.controller.DemoController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();
        logger.info("url {}",httpServletRequest.getRequestURL());
        logger.info("method {}",httpServletRequest.getMethod());
        logger.info("ip {}",httpServletRequest.getRemoteAddr());
        logger.info("class_method {}",joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("args {}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("2222");
    }

    @AfterReturning(pointcut = "log()",returning = "o")
    public void doAfterReturning(Object o){
        logger.info("response {}",o);
    }
}
