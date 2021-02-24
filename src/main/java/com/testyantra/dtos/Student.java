package com.testyantra.dtos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="student_name")
	private String studentName;
	
	@ElementCollection
	private List<Address> list;

	public Student(int studentId, String studentName, List<Address> list) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.list = list;
	}

	public Student() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Address> getList() {
		return list;
	}

	public void setList(List<Address> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", list=" + list + "]";
	}
	
	
}
