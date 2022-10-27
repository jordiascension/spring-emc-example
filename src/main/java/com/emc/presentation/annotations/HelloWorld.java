package com.emc.presentation.annotations;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*Con esta anotación Scope indicamos cuando se crearan instancias de la clase 
 * con esta anotación y en que ámbito. Si no se usa la anotación @Scope 
 * (valor por defecto) el scope es singleton. Los posibles valores son:

singleton: Se crea una unica instancia del bean para toda la aplicación.
prototype: Se crea una nueva instacia del bean cada vez que se hace una llamada.
request: Se crea una nueva instacia del bean para cada petición HTTP request.
session: Se crea una nueva instacia del bean por sesión HTTP.
globalSession: Se crea una nueva instacia del para cada sesión HTTP global.*/
@Component(value = "helloWorldConst")
@Scope("singleton")
public class HelloWorld {

	private String hello;
	private UUID uuid;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public HelloWorld() {

	}

	@Autowired
	public HelloWorld(@Value("Hello World from constructor") String hello) {
		uuid = UUID.randomUUID();
		this.hello = hello;
	}

}
