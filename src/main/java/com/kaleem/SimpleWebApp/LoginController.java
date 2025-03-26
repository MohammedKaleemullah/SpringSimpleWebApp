package com.kaleem.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        System.out.println(username +" "+ password);
        return "Hello World";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String anotherHome(){
        return "LoginController says Hello World";
    }
}
