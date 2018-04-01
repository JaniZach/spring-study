package com.company.springstudy.service;

import lombok.Setter;

/**
 * @author P50
 * @date 2018/4/1 15:43
 */
public class UseFunctionService {

    @Setter
    private FunctionService functionService;

    public void doSomeThing() {
        System.out.println(functionService.say());
    }

}
