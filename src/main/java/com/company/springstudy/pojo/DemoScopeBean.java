package com.company.springstudy.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/4/1 16:50
 * 默认singleton,表示单例
 * 如果改为prototype,表示原型,即每次获取均创建新对象
 */
@Service
@Scope(value = "prototype")
public class DemoScopeBean {
}
