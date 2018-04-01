package com.company.springstudy.config;

import com.company.springstudy.service.AsyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author P50
 * @date 2018/4/1 15:40
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            bean.executeAsyncTask(i);
            bean.executeAsyncTaskPlus(i);
        }
        context.close();
    }

}
