package com.example.pertemuan11.controller;

import ch.qos.logback.core.model.Model;
import com.example.pertemuan11.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final AuthService authService;

    @GetMapping("/home")
    public String home(Model model) {
        User user = authService.getLoggedInUser();
        model.addAttribute("user", user);
        model.addAttribute("profile", user.getProfile());
        return "home";
    }
}
