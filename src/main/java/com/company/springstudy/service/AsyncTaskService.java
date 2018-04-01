package com.company.springstudy.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/4/1 18:13
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer integer) {
        System.out.println("执行异步任务："+integer);
    }

    @Async
    public void executeAsyncTaskPlus(Integer integer) {
        System.out.println("执行异步任务+1："+(integer+1));
    }

}
