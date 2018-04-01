package com.company.springstudy.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author P50
 * @date 2018/4/1 16:12
 */
@Aspect
@Component
public class ActionAOP {

    @Pointcut(value = "@annotation(com.company.springstudy.annotation.Action)")
    public void annotationPointCut(){}

    /**
     * 声明建言advice，使用@PointCut定义的切点
     * @param joinPoint
     */
    @After(value = "annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println(String.format("方法名:%s,注解的值:%s",method.getName(),annotation.name()));
    }

    /**
     * 声明建言advice,直接使用规则拦截作为参数
     * @param joinPoint
     */
    @Before(value = "execution(* com.company.springstudy.pojo..*.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(String.format("被拦截的方法:%s",method.getName()));
    }

}
