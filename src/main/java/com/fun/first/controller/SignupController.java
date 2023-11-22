package com.fun.first.controller;


import com.fun.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    private final UserService userService;

    @Autowired
    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String showSignupForm(User user) {
        return "signup";
    }

    @PostMapping("/signup")
    public String processSignupForm(User user) {
        userService.saveUser(user);
        return "redirect:/signup?success";
    }
}
