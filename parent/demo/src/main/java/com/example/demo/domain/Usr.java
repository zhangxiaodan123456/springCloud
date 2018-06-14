package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class Usr implements Serializable{
  private String id;
  public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private String name;
  private String age;
  private String address;
  private String sex;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Usr(String name, String age, String address, String sex) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
	this.sex = sex;
}
public Usr() {
	super();
	// TODO Auto-generated constructor stub
}
}
