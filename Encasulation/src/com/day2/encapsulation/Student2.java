package com.day2.encapsulation;

public class Student2 {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		s.name="madhan";
        s.age=20;
		s.regNO=36;
		s.per=98.5f;
		System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getPer());
		System.out.println(s.getRegNO());
	}

}
