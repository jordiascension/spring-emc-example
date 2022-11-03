package com.emc.aspects.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.emc.aspects.annotations");
		annotationContext.refresh();

		Compra cp = annotationContext.getBean(Compra.class);

		try {
			// sin errores
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			// System.out.println("Invocamos para que se produzca un error");
			// cp.compra(true);
		} catch (Exception e) {
			System.out.println("Obtenemos la excepcion" + e);
		}

		annotationContext.close();

	}

}
