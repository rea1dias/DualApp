package com.example.dual_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DualController {

    @GetMapping("/")
    public String home() {
        return "home";
    }



}
