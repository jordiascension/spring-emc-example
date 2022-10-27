package com.emc.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		annotationContext.scan("com.emc.presentation.annotations");
		annotationContext.refresh();

		HelloWorld helloWorld = (HelloWorld) annotationContext
				.getBean("helloWorldConst");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());

		HelloWorld helloWorld1 = (HelloWorld) annotationContext
				.getBean("helloWorldConst");
		System.out.println(helloWorld1.getHello());
		System.out.println(helloWorld1.getUuid());

		annotationContext.close();
	}

}
