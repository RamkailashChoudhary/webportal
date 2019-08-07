package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicJavaController {

    @GetMapping("/spring-boot")
    public String bootHomePage(){
        return "pages/";
    }
}
