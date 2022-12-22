package com.example.test4.service.serviceiplm;

import com.example.test4.entity.Student;
import com.example.test4.repo.StudentRepository;
import com.example.test4.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsImpl implements StudentsService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getByID(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
