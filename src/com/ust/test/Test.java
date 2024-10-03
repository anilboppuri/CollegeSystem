package com.ust.test;

import com.ust.model.Semester;
import com.ust.model.Student;
import com.ust.util.ExamBranch;

public class Test {

	public static void main(String[] args) {

		  Semester s1 = new Semester(11, 25,45,67,87,23,25);
		  Semester s2 = new Semester(12, 25,45,67,87,23,25);
		  Semester s3 = new Semester(21, 25,45,67,87,23,25);
		  Semester s4 = new Semester(22,95,45,67,87,23,25);
		  Student st1 = new Student();
		
		  st1.setStudentId(101);
		  st1.setDepartment("CSE");
		  st1.getSemesters().put(s1.getSemId(),s1);
		  st1.getSemesters().put(s2.getSemId(),s2);
		  st1.getSemesters().put(s3.getSemId(),s3);
		  st1.getSemesters().put(s4.getSemId(),s4);
		  
		//  System.out.println(st1);
		  
		  ExamBranch branch = new ExamBranch();
		  branch.getStudents().add(st1);
		System.out.println(branch);
		  
		
		  System.out.println(branch.getStudentById(101));
		  System.out.println(branch.getStudentByIdBySemester(101,22));
		  System.out.println(branch.getStudentByIdBySemesterPracticals(101,21,2));
	}

}
