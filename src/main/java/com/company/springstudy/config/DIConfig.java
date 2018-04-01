package com.company.springstudy.config;

import com.company.springstudy.pojo.DemoInitDestory;
import com.company.springstudy.service.FunctionService;
import com.company.springstudy.service.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author P50
 * @date 2018/4/1 15:39
 *
 * DI配置类
 */
@Configuration
@ComponentScan(value = "com.company.springstudy")
public class DIConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService service = new UseFunctionService();
        service.setFunctionService(functionService());
        return service;
    }

    @Bean(initMethod = "init", destroyMethod = "destory")
    public DemoInitDestory demoInitDestory() {
        return new DemoInitDestory();
    }

}
