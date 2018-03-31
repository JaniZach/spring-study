package com.company.springstudy.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author P50
 * @date 2018/3/31 19:54
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;

}
