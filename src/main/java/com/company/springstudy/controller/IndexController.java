package com.company.springstudy.controller;

import com.company.springstudy.pojo.MyBook;
import com.company.springstudy.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @author P50
 * @date 2018/3/31 15:10
 */
@Controller
public class IndexController {

    @Autowired
    private MyBook myBook;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        String str = String.format("%s,%s", myBook.getName(), myBook.getAuthor());
        return str;
    }

    @RequestMapping(value = "/person")
    public String person(Model model) {
        Person person1 = new Person("小明", 10);
        Person person2 = new Person("小红", 11);
        Person person3 = new Person("小绿", 12);
        Person person4 = new Person("小黑", 13);
        model.addAttribute("person", person1);
        model.addAttribute("personList", Arrays.asList(person1, person2, person3, person4));
        return "index";
    }

    @RequestMapping(value = "/httpclient")
    @ResponseBody
    public String client() {
        return "success";
    }

}
