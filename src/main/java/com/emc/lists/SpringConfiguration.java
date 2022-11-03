package com.emc.lists;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public List<Teacher> teacherList() {

		List<Teacher> teacherList = new ArrayList<Teacher>();

		Teacher teacher1 = new Teacher();
		teacher1.setId(1);
		teacher1.setName("Pepe");

		teacherList.add(teacher1);

		Teacher teacher2 = new Teacher();
		teacher2.setId(2);
		teacher2.setName("Alberto");

		teacherList.add(teacher2);

		return teacherList;
	}
}
