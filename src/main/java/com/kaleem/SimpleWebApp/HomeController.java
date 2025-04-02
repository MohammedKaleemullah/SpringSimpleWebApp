package com.kaleem.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/person")
    public Person displayPerson() {
        Person p = new Person("Kaleem", 22);
        System.out.println(p);
        return p;
    }

    @PostMapping(path = "person/post")
    public void setPerson(Person p) {
        System.out.println(p);
    }

    @RequestMapping("")
    public String home() {
        return "HomeController says home page";
    }
}
