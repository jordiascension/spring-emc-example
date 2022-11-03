package com.emc.xml.lists;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	static Logger log = Logger.getLogger(Principal.class.getName());

	public static void main(String[] args) {

		log.info("The project is started");
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		// Property Dependency Injection
		@SuppressWarnings("unchecked")
		List<Teacher> teacherList = (List<Teacher>) context.getBean("teachers");
		log.info(teacherList);

		for (Teacher teacher : teacherList) {
			log.info(teacher.getId());
			log.info(teacher.getName());

		}
		context.close();

		log.info("The project is finished");
	}
}
