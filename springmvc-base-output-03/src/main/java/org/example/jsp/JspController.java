package org.example.jsp;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/jsp")
@Controller
@Slf4j
public class JspController {

    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("data", "Hello SpringMVC");
        System.out.println("JspController.index");
        return "index";
    }

}
