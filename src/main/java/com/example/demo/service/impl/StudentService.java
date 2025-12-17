package com.example.demo.service;


import java.util.List;
import com.example.demo.entity.Student;

public Interface StudentService{
    Student createData(Student stu);
    List<Student> fetchRecord();
}