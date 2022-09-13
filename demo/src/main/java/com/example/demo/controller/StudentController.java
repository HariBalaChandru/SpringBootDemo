package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @PostMapping("/addStudent")
  public Student addStudent(@RequestBody Student student){
    return studentService.insertStudent(student);
  }

  @GetMapping("/getAllStudents")
  public List<Student> getAllStudents(){
    return studentService.getAllStudents();
  }

  @PostMapping("/updateStudent")
  public Student updateStudent(@RequestBody Student student){
    return studentService.updateStudent(student);
  }
}
