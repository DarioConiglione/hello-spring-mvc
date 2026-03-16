package org.lessons.java.hello_spring_mvc.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String Greetings() {
        return "greetings";
    }

    @GetMapping("/home")
    public String Home() {
        return "home";
    }

    @GetMapping("/utente")
    public String Utente(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("surname", "Coniglione");

        model.addAttribute("time", LocalTime.now());

        return "utente";
    }

}
