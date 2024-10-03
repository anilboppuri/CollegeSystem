package com.ust.util;

import java.util.ArrayList;
import java.util.Iterator;

import com.ust.model.Semester;
import com.ust.model.Student;

public class ExamBranch {

	    ArrayList<Student> students = new ArrayList<>();

	     
	     public ArrayList<Student> getStudents() {
			return students;
		}

		public void setStudents(ArrayList<Student> students) {
			this.students = students;
		}
	     
		void addStudent(Student student) {
			students.add(student);
		}
		
		
		

		
		
		
		
		
		
		
	public 	Student getStudentById(int id) {
	    	 Iterator<Student> iter = students.iterator();
			 Student currentStudent = null;
			 while(iter.hasNext()) {
				        currentStudent  = iter.next();
				        if(currentStudent.getStudentId() == id)
				        	break;
			 }
			return currentStudent;
		}
		
		public Semester getStudentByIdBySemester(int id, int semKey) {
			 Semester requiredSem = null;
			 Iterator<Student> iter = students.iterator();
			 Student currentStudent = null;
			 while(iter.hasNext()) {
				        currentStudent  = iter.next();
				        if(currentStudent.getStudentId() == id) {
				        	  requiredSem = currentStudent.getSemesters().get(semKey);
				        	  break;
				        }
		       }
		
			return requiredSem;
		}
		public int getStudentByIdBySemesterPracticals(int id, int semKey, int practical) {
			 Semester requiredSem = null;
			 int requiredPracticalMarks = 0;
			 Iterator<Student> iter = students.iterator();
			 Student currentStudent = null;
			 while(iter.hasNext()) {
				        currentStudent  = iter.next();
				        if(currentStudent.getStudentId() == id) {
				        	 requiredSem = currentStudent.getSemesters().get(semKey);
				        	 if(practical == 1)
				        	 requiredPracticalMarks = requiredSem.getPractical1();
				        	 else if(practical == 2)
				        		 requiredPracticalMarks = requiredSem.getPractical2();
				        	  break;
				        }
		       }
			return requiredPracticalMarks;
		}
		
		

		@Override
		public String toString() {
			return "ExamBranch [students=" + students + "]";
		}
	     
	     
}
