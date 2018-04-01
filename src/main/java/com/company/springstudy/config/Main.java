package com.company.springstudy.config;

import com.company.springstudy.pojo.DemoScopeBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author P50
 * @date 2018/4/1 15:40
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        DemoScopeBean bean1 = context.getBean(DemoScopeBean.class);
        DemoScopeBean bean2 = context.getBean(DemoScopeBean.class);
        System.out.println(bean1 == bean2);
        context.close();
    }

}
