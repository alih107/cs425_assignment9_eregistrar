package com.example.cs425_assignment_eregistrar.controller;

import com.example.cs425_assignment_eregistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}
