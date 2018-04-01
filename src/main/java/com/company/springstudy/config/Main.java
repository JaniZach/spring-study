package com.company.springstudy.config;

import com.company.springstudy.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author P50
 * @date 2018/4/1 15:40
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        UseFunctionService service = context.getBean(UseFunctionService.class);
        service.doSomeThing();
        context.close();
    }

}
