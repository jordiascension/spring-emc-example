package com.emc.presentation.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		// Property Dependency Injection
		Student student = (Student) context.getBean("student");
		System.out.println(student.toString());

		// Constructor Dependency Injection
		Student studentConst = (Student) context.getBean("studentConst");
		System.out.println(studentConst.toString());

		context.close();
	}

}
