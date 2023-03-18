package com.codingrecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // root
    @GetMapping("/")
    public String index() {
        return "index";     // templates/index.html
    }


}
