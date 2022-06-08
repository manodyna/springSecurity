package com.example.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String goHome(){
        return "home";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
