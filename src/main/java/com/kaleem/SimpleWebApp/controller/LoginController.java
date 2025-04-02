package com.kaleem.SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
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
