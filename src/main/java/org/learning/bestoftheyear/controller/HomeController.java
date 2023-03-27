package org.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping String home(Model model){
        model.addAttribute("name", "Luis");
        return "home";
    }
}
