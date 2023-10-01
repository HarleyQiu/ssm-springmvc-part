package org.example.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {

    //  path/账号/密码

    //动态路径设计  {key} =  *  {key} 在形参列表获取传入的参数
    //接受路径参数  String account,String password -> 接受param格式参数
    // 必须使用 @PathVariable
    @GetMapping("/{username}/{password}")
    public String login(
            @PathVariable String username,
            @PathVariable String password) {
        System.out.println("username = " + username + ", password = " + password);
        return "username = " + username + ", password = " + password;
    }
}
