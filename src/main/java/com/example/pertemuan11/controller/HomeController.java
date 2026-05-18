package com.example.pertemuan11.controller;

import com.example.pertemuan11.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.pertemuan11.model.User;

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
