package com.emc.presentation.pure.config;

//Default scope Singleton
/*
 * @Repository - Used to mark a bean as DAO Component on persistence layer
   @Service - Used to mark a bean as Service Component on business layer
   @RestController - Used to mark a bean as RestController Component on Web Service layer
   @Controller - Used to mark a bean as Controller Component on Presentation layer
   @Configuration - Used to mark a bean as Configuration Component.
   @Component - General purpose annotation, can be used as a replacement for above annotations.
   http://www.baeldung.com/spring-bean-scopes
   https://www.javatpoint.com/dependency-injection-with-factory-method
 * */
public class HelloWorld {

	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public HelloWorld() {

	}
}
