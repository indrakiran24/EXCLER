package com.studentdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Studentdetails {
@Id
int RollNo;
String Name;
String Branch;
String Email;
int PhoneNo;
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getBranch() {
	return Branch;
}
public Studentdetails() {
	super();
	// TODO Auto-generated constructor stub
}
public Studentdetails(int rollNo, String name, String branch, String email, int phoneNo) {
	super();
	RollNo = rollNo;
	Name = name;
	Branch = branch;
	Email = email;
	PhoneNo = phoneNo;
}
@Override
public String toString() {
	return "Studentdetails [RollNo=" + RollNo + ", Name=" + Name + ", Branch=" + Branch + ", Email=" + Email
			+ ", PhoneNo=" + PhoneNo + "]";
}
public void setBranch(String branch) {
	Branch = branch;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(int phoneNo) {
	PhoneNo = phoneNo;
}
}

