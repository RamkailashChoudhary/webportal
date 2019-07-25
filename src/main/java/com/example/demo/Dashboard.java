package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dashboard {

    @GetMapping("/")
    public String indexPage(){
        return "pages/index";
    }

    @GetMapping("/cities")
    public String homePage(){
        return "pages/home-page";
    }


}
