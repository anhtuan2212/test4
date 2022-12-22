package com.example.test4.controller;

import com.example.test4.entity.Student;
import com.example.test4.repo.StudentRepository;
import com.example.test4.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentsService studentsService;

    @GetMapping({"/","index"})
    public String Home(Model model){
        List<Student> lst = studentRepository.findAll();
        model.addAttribute("students",lst);
        return ("/index");
    }

    @RequestMapping(value = "save" ,method = RequestMethod.POST)
    public String create (Student student){
        studentsService.create(student);
        System.out.println("ADD :" + student);
        return ("redirect:/index");
    }

    @GetMapping("/add")
    public String add (Model model){
        model.addAttribute("student",new Student());
        return ("/add");
    }


    @GetMapping("/update")
    public String update (@RequestParam("id") Integer id,Model model){
        Student lst = studentRepository.getById(id);
        model.addAttribute("student",lst);
        System.out.println(lst);
        return ("/update");
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete (@RequestParam("id") Integer id){
        studentsService.delete(id);
        return ("redirect:/index");
    }
}