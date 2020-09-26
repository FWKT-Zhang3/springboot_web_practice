package com.max.springboot_practice.springboot_web_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Max Zhang on 2020/9/25.
 */
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "test");
        return "success";
    }
}
