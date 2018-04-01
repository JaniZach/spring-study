package com.company.springstudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/4/1 15:43
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public void doSomeThing() {
        System.out.println(functionService.say());
    }

}
