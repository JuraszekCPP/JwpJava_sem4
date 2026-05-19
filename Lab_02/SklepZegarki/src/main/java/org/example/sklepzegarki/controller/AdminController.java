package org.example.sklepzegarki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.example.sklepzegarki.model.Zegarek;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String adminPage() {
        return "adminview/additem";
    }

    @PostMapping
    public String addItem(Zegarek zegarek) {
        HomeController.zegarki.add(zegarek);
        return "redirect:/";
    }
}