package com.example.test4.service;

import com.example.test4.entity.Student;

import java.util.Optional;

public interface StudentsService {
     Student create(Student student);
     Student update(Student student);
    void delete(Integer id);
}
