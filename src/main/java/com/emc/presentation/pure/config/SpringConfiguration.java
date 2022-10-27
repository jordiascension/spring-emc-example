package com.emc.presentation.pure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setHello("Hello World using pure Configuration Classes");
		return helloWorld;
	}
}
