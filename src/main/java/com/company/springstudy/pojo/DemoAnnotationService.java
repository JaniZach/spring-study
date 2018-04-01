package com.company.springstudy.pojo;

import com.company.springstudy.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/4/1 16:08
 *
 * 使用注解规则的被拦截类
 */
@Service
public class DemoAnnotationService {

    @Action(name = "名称")
    public void add(){
        System.out.println("annotatin add");
    }
}
