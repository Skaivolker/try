package com.example.demo.model;

import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;

public class News {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
}
