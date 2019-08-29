package com.web.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Alok");
        return "home";
    }

    @RequestMapping("/{username}")
    @ResponseBody
    public String getUser(@PathVariable final String username) {
        String user = username.toLowerCase();
        if (user.length() < 5) {
            throw new IllegalArgumentException("Username is less than 5");
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username is less than 5");
        }
        return user;
    }

}
