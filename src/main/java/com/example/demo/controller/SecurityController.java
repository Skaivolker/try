package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

        @GetMapping("/login")
        public String getLogin(){
            return "login";
        }

        @GetMapping("/unauthorised")
        public String getUnauthorised(){
            return "unauthorised";
        }
    }
}
