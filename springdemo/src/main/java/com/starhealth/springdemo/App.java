package com.starhealth.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		 BeanFactory factory = new XmlBeanFactory(new
		 ClassPathResource("application.xml"));

		//ApplicationContext factory = new ClassPathXmlApplicationContext("application.xml");

		/*
		 * Object o = factory.getBean("emp1");
		 * 
		 * Employee emp1 = (Employee) o;
		 * 
		 * System.out.println(emp1);
		 * 
		 * System.out.println(emp1.getEid() + " " + emp1.getEname() + " " +
		 * emp1.getSalary());
		 * 
		 * Employee emp2 = factory.getBean("emp2", Employee.class);
		 * 
		 * System.out.println(emp2);
		 * 
		 * System.out.println(emp2.getEid() + " " + emp2.getEname() + " " +
		 * emp2.getSalary());
		 */

		/*
		 * Employee emp1 = factory.getBean("emp1", Employee.class);
		 * 
		 * System.out.println(emp1);
		 * 
		 * System.out.println(emp1.getEid() + " " + emp1.getEname() + "  " +
		 * emp1.getSalary());
		 * 
		 * Employee emp4 = factory.getBean("emp4", Employee.class);
		 * 
		 * System.out.println(emp4); System.out.println(emp4.getEid() + " " +
		 * emp4.getEname() + "  " + emp4.getSalary());
		 */
		
		
		Address a1 =		factory.getBean("a1",Address.class);
		
		System.out.println(a1);
		
		
		
		
		
		Employee e1 = factory.getBean("emp1", Employee.class);
		
		System.out.println(e1);
		
		System.out.println(e1.getAddress());
		
		System.out.println(e1.getSkills());
		
		
		
		/*
		 * Employee e2 = factory.getBean("emp1", Employee.class);
		 * 
		 * System.out.println(e2);
		 * 
		 * 
		 * Employee e3 = factory.getBean("emp1", Employee.class);
		 * 
		 * System.out.println(e3);
		 * 
		 * 
		 * 
		 * Hello h1 = factory.getBean(Hello.class);
		 * 
		 * System.out.println(h1);
		 * 
		 * Hello h2 = factory.getBean(Hello.class);
		 * 
		 * System.out.println(h2);
		 */
		
		

		
	}
}
