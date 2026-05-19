package org.example.sklepzegarki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.example.sklepzegarki.model.Zegarek;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    public static List<Zegarek> zegarki = new ArrayList<>();

    static {
        zegarki.add(new Zegarek("Seiko 5 Sports", new BigDecimal("2100.00"), "/images/seiko5sports.png"));
        zegarki.add(new Zegarek("Seiko 5 Sports GMT", new BigDecimal("2100.00"), "/images/seiko5sportsgmt.jpg"));
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", zegarki);
        return "home";
    }
    @GetMapping("/cart")
    public String cart() {
        return "cartView";
    }
    @GetMapping("/summary")
    public String summary() {
        return "summary";
    }
}