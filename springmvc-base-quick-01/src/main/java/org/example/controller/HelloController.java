package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/spring/hello")
    @ResponseBody  // 直接返回字符串给前端 不找视图解析器
    public String hello() {
        System.out.println("HelloController.hello");
        return "hello SpringMVC!";
    }

}
