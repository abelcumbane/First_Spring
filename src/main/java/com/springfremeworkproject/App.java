package com.springfremeworkproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main(String[] args) {
		
		//Inversão de Controle (IoC) – O Spring gerencia os objetos da aplicação, reduzindo o acoplamento
		//IoC container - this is where the bean are located
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * We do not get a NULL exception because the spring container
		 * does not instantiation under the hood
		 * */
		Student s = (Student) context.getBean("student_bean");
		s.setStudentName("Abel");
		System.out.println(s.getStudentName());
		
		Student s1 = (Student) context.getBean("student_bean");
		System.out.println(s1.getStudentName());
		
		
		
	}

}
