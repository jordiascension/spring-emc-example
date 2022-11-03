package com.emc.lists;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	static Logger log = Logger.getLogger(Principal.class);

	public static void main(String[] args) {

		log.info("The project is started");
		// TODO Auto-generated method stub
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		// Property Dependency Injection
		// https://www.baeldung.com/spring-getbean

		log.info("Going to create teacherList Object");
		@SuppressWarnings("unchecked")
		List<Teacher> teacherList = (List<Teacher>) appContext
				.getBean("teacherList");
		log.info("teacherList Object is created");
		log.info(teacherList);

		teacherList.forEach((final Teacher teacher) -> System.out
				.println(teacher.getId() + " " + teacher.getName()));

		appContext.close();

		log.info("The project is finished");
	}
}
