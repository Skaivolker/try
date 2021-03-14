package com.example.demo.controller;

import com.example.demo.model.News;
import com.example.demo.repository.NewsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/news")
public class NewsController {

    private final NewsRepo newsRepo;

    @GetMapping
    public String getNews(Model model){
        model.addAttribute("allNews", newsRepo.findAll());
        return "news";
    }

    @PostMapping("/create")
    public String create(News news){
        newsRepo.save(news);
        return "redirect:/admin";
    }
}
