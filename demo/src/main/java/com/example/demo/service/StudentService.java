package com.example.demo.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;


import java.util.*;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public Student insertStudent(Student s){
    return studentRepository.save(s);
  }

  public List<Student> getAllStudents(){
    return (List<Student>)studentRepository.findAll();
  }

  public Student updateStudent(Student s){
    Optional<Student> optionalStudent = studentRepository.findById(s.getId());
    if (optionalStudent.isPresent()){
      Student studentRecord = optionalStudent.get();
      studentRecord.setName(StringUtils.defaultIfBlank(s.getName(), studentRecord.getName()));
      studentRecord.setMobile(StringUtils.defaultIfBlank(s.getMobile(), studentRecord.getMobile()));
      studentRecord.setEmail(StringUtils.defaultIfBlank(s.getEmail(), studentRecord.getEmail()));
      return studentRepository.save(studentRecord);
    }
    else{
      return null;
    }
  }

}
