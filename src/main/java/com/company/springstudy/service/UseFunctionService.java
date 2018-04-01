package com.company.springstudy.service;

/**
 * @author P50
 * @date 2018/4/1 15:43
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void doSomeThing() {
        System.out.println(functionService.say());
    }

}
