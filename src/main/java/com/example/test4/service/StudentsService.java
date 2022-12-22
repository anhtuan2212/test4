package com.example.test4.service;

import com.example.test4.entity.Student;

public interface StudentsService {
     Student create(Student student);
     Student update(Student student);
     Student getByID(Integer id);
    void delete(Integer id);
}
