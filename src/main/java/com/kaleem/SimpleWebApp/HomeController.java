package com.kaleem.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @GetMapping("/person")
    public Person displayPerson() {
        Person p = new Person("Kaleem", 22);
        System.out.println(p);
        return p;
    }

    @RequestMapping("/")
    public String home() {
        return "HomeController says home page";
    }
}
