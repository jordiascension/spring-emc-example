package com.emc.aspects.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.emc.aspects.annotations")
@Component
public class CompraImpl implements Compra {

	@Override
	public void compra(boolean error) throws Exception {
		if (error) {
			throw new Exception("Algo ha ido mal...");
		}
		System.out.println("Realizando la compra...");
	}

}
