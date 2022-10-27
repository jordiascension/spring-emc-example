package com.emc.presentation.annotations.props;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	// Example with prototype Scope
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		annotationContext.scan("com.emc.presentation.annotations.props");
		annotationContext.refresh();

		HelloWorld helloWorld = (HelloWorld) annotationContext
				.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		System.out.println(helloWorld.getUuid());

		HelloWorld helloWorld1 = (HelloWorld) annotationContext
				.getBean("helloWorld");
		System.out.println(helloWorld1.getHello());
		System.out.println(helloWorld1.getUuid());

		annotationContext.close();
	}

}
