package org.btm.dependencyApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
   ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
   Icars c1 = (Icars) context.getBean("bm");
   c1.drive();
   Icars c2 = (Icars) context.getBean("nn");
   c2.drive();
	}

}
