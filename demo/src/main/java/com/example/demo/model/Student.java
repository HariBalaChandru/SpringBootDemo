package com.example.demo.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

  @Id
  @GeneratedValue
  @Basic
  private Integer id;
  private String name;
  private String email;
  private String mobile;

  public Student(){
    this.name = "";
    this.email = "";
    this.mobile = "";
  }
  public Student(String name, String email, String mobile){
    this.name = name;
    this.email = email;
    this.mobile = mobile;
  }
  public String getName(){
    return name;
  }
  public String getEmail(){
    return email;
  }
  public String getMobile(){
    return mobile;
  }
  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setMobile(String mobile){
    this.mobile = mobile;
  }
}
