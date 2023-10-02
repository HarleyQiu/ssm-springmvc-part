package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/data")
    public String data() {
        //空指针异常
        String name = null;
        System.out.println("UserController.data");
        name.toString(); //空指针异常 NullPointerException
        return "ok";
    }

    @GetMapping("/data1")
    public String data1() {
        //算数异常
        System.out.println("UserController.data1");
        int i = 1/0; //除零异常 ArithmeticException
        return "ok";
    }

}
