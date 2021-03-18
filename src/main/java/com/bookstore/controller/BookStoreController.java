package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookStoreController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
