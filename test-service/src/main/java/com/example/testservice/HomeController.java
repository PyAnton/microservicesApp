package com.example.testservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping
    @ResponseBody
    public String getHome(){
        return "Welcome in home!";
    }
    @GetMapping("/test")
    @ResponseBody
    public String getTest(){
        return "ready Test!";
    }
}
