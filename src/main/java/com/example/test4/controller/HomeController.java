package com.example.test4.controller;

import com.example.test4.entity.Student;
import com.example.test4.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping({"/","index"})
    public String Home(Model model){
        List<Student> lst = studentRepository.findAll();
        model.addAttribute("students",lst);
        return ("/index");
    }
    @GetMapping("/update")
    public String Update (Model model){
        Student lst = studentRepository.getById(1);
        model.addAttribute("student",lst);
        return ("/form");
    }
}