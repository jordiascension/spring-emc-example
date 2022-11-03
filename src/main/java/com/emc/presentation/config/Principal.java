package com.emc.presentation.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		HelloWorld helloWorld = appContext.getBean(HelloWorld.class);
		System.out.println(helloWorld.getHello());

		appContext.close();

	}

}
