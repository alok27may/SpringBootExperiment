package com.web.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    private String home(Model model) {
        model.addAttribute("name", "Alok");
        return "home";
    }

}
