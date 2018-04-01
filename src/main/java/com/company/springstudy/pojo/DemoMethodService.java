package com.company.springstudy.pojo;

import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/4/1 16:10
 *
 * 使用方法规则的被拦截类
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("method add");
    }
}
