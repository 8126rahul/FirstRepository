package org.rahul.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = (Coach) context.getBean("thatCoach");
		System.out.println("This class is demo for git repository********");
		System.out.println(coach.getDailyWorkout());
	}

}
