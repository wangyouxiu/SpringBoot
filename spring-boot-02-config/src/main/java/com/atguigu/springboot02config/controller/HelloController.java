package com.atguigu.springboot02config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @ClassName HelloController
 * @Description TODO描述
 * @Author wangyue
 * @Date 2019/11/14 18:52
 **/
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World quick"+name;
    }
}
