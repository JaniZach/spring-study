package com.company.springstudy.config;

import com.company.springstudy.pojo.DemoInitDestory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author P50
 * @date 2018/4/1 15:40
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        DemoInitDestory bean = context.getBean(DemoInitDestory.class);
        context.close();
    }

}
