package com.example.test4.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;
    @Column(name = "dateofbirth")
    Date dateOfBirth;
    @Column(name = "majoring")
    String majoring;
    @Column(name = "status")
    Boolean status;
}
