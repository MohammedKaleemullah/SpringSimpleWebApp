package com.kaleem.SimpleWebApp.controller;

import com.kaleem.SimpleWebApp.model.Person;
import org.springframework.web.bind.annotation.*;

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
