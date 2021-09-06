package com.java.practiceCode;

public class Student {

	int rollNumber;
	String name;
	String division;

	public void display() {

		System.out.println("rollNumber is =" + rollNumber);
		System.out.println("name is =" + name);
		System.out.println("division is =" + division);
		System.out.println("==============================");

	}

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.rollNumber = 101;
		s1.name = "Swapnil";
		s1.division = "A";
		s1.display();

		Student s2 = new Student();

		s2.rollNumber = 1630;
		s2.name = "Shiva";
		s2.division = "A+";
		s2.display();

	}

}
