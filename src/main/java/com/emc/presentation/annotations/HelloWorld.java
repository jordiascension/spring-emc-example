package com.emc.presentation.annotations;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*Con esta anotaci�n Scope indicamos cuando se crearan instancias de la clase 
 * con esta anotaci�n y en que �mbito. Si no se usa la anotaci�n @Scope 
 * (valor por defecto) el scope es singleton. Los posibles valores son:

singleton: Se crea una unica instancia del bean para toda la aplicaci�n.
prototype: Se crea una nueva instacia del bean cada vez que se hace una llamada.
request: Se crea una nueva instacia del bean para cada petici�n HTTP request.
session: Se crea una nueva instacia del bean por sesi�n HTTP.
globalSession: Se crea una nueva instacia del para cada sesi�n HTTP global.*/
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
