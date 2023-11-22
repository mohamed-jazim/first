package com.fun.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @GetMapping("/index")
    private String f1(){
        return "display";
    }
}
