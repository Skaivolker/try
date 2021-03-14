package com.example.demo.controller;

import com.example.demo.model.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping
    public String getIndex(Model model){
        model.addAttribute("newNews", new News());
        return "admin_page";
    }
}
