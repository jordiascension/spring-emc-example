package com.emc.aspects.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//https://www.arquitecturajava.com/el-concepto-de-java-proxy-pattern/
//https://www.arquitecturajava.com/spring-aop-y-aspectos/
/*
 * Consejo: (advice) es el código que se quiere 
 * introducir, el trabajo que va a realizar el
 *  aspecto
Puntos de entrada y puntos de corte: 
(join points/pointcuts). El primero indica los 
puntos del código donde se puede aplicar un aspecto 
y el punto de corte es el punto de entrada 
seleccionado para aplicar el aspecto.
Aspecto: (aspect) es la asociación del consejo con 
el punto de corte.
Introducción: (introduction) introducir nuevos 
métodos o atributos a clases existentes
 * 
 * Vamos a capturar la ejecución del bean compra 
 * de modo que antes de que se ejecute el 
 * método “compra()�? se compruebe la cantidad y 
 * después de que se ejecute, empaquetemos el
 * producto. También realizaremos otra acción
 * el caso de que en el proceso de compra se 
 * produzca un error. Esta seré la clase que 
 * utilizaremos para implementar el consejo:
 * */
@Aspect
@Component
public class ValidarMaterial {

	@Before("execution( * com.emc.aspects.annotations.CompraImpl.compra(..) )")
	public void comprobarCantidad() {
		System.out.println("Se comprueba que es la cantidad correcta");
	}

	@AfterReturning("execution( * com.emc.aspects.annotations.CompraImpl.compra(..) )")
	public void empaquetar() {
		System.out.println("Se empaqueta la mercancia");
	}

	@AfterThrowing("execution( * com.emc.aspects.annotations.CompraImpl.compra(..) )")
	public void ponerReclamacion() {
		System.out.println("Se reclaman los defectos detectados");
	}
}
