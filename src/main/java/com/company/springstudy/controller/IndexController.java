package com.company.springstudy.controller;

import com.company.springstudy.pojo.MyBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
