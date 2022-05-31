package org.student;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("My id Number is" + (id));

	}
	public void getStudentInfo (int id, String name) {
		System.out.println("My id Number is" + (id));
		System.out.println("My Name Is" + name);

	}

	public void getStudentInfo (String email, long phoneNumber) {

		System.out.println("My email id is" + (email));
		System.out.println("My Phone Number is" + (phoneNumber));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu = new Students();
		stu.getStudentInfo(8572);
		stu.getStudentInfo(8573, "Manoj");
		stu.getStudentInfo("s.manojmano.1991@gmail.com", 7989080723L);

	}

}
