package com.company.springstudy.config;

import com.company.springstudy.pojo.DemoAnnotationService;
import com.company.springstudy.pojo.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author P50
 * @date 2018/4/1 15:40
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        annotationService.add();
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        methodService.add();
        context.close();
    }

}
