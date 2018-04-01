package com.company.springstudy.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author P50
 * @date 2018/4/1 15:40
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig bean = context.getBean(ELConfig.class);
        try {
            bean.outputResource();
        } catch (Exception e) {
            e.printStackTrace();
        }
        context.close();
    }

}
