package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MuleSoftController {

    @GetMapping("/dataweave")
    public String dataWeaves(){
        return "pages/dataweaves";
    }

    @GetMapping("/mulesoft")
    public String muleSoftPage(){
        return "pages/mule-soft-page";
    }

    @GetMapping("/muleSoftInterviewQuestion")
    public String interviewQuestion(){
        return "pages/mulesoft-interview";
    }
}
