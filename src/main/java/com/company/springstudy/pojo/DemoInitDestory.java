package com.company.springstudy.pojo;

import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/4/1 17:58
 */
@Service
public class DemoInitDestory {

    //@PostConstruct
    public void init(){
        System.out.println("DemoInitDestory init");
    }

    //@PreDestroy
    public void destory(){
        System.out.println("DemoInitDestory destory");
    }

}
