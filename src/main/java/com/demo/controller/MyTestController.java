package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller注解表明MyTestController这是一个控制器类，是一个SpringMVC Controller对象
//@RequestMapping注解是一个用来处理请求地址映射的注解。可以用于类或者方法上。
// 用于类上表示类中的所有相应请求的方法都是以该地址作为父路径
@Controller
@RequestMapping("/test")
public class MyTestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }

}
