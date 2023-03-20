package com.entornos.victor.poligonos.main;

import com.entornos.victor.poligonos.figuras.Circulo;
import com.entornos.victor.poligonos.figuras.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Rectangulo r1 = new Rectangulo(5,10);
		Rectangulo r2 = new Rectangulo();
		
		/**
		 * Crear un array con cinco circulos con
		 * radio aleatorio y comprobar la salida 
		 * del depurador. Crearlos con un bucle.
		 * Poner breakpoint en el FOR
		 */

		Circulo[] c = new Circulo[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circulo();
		}
	}

}
