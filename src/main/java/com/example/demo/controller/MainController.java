package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String getIndex(){
        return "index";
    }

    @GetMapping
    public String getNews(){
        return "news";
    }
}
