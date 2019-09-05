package com.example.springboot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

//@RestController// == @ResponseBody +  @Controller

@Controller
public class helloController {

    @Value("${person.lastName}")
    private String name;
    @ResponseBody//页面拼接
    @RequestMapping("/hello")
    public String sayHello(){

        return "hello" + name;
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "success";
    }
}
