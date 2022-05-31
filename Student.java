package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() 
	{
		System.out.println("Sai Manoj Kumar");
	}
	public void studentDept()
	{
		System.out.println("Automation Testing");
	}
	public void studentId() 
	{
		System.out.println("853400");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
	
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.collageName();
		stud.collageCode();
		stud.collageRank();
		stud.deptName();

	}

}

