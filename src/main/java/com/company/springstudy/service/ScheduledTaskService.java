package com.company.springstudy.service;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author P50
 * @date 2018/4/1 18:33
 */
@Service
@EnableScheduling
public class ScheduledTaskService {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /** 每隔五秒执行一次 */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次"+sdf.format(new Date()));
    }

    /** 每天的19点17分50秒执行 */
    @Scheduled(cron = "50 17 19 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间" + sdf.format(new Date()) + "执行");
    }
}
