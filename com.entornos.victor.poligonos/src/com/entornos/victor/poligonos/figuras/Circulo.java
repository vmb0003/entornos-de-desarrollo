package com.entornos.victor.poligonos.figuras;

import java.util.Random;

/**
 * Representa un circulo. Contiene constructores para crear
 * un circulo dado el radio y para crear un circulo con un 
 * radio aleatorio entero entre 1 y 10. Contiene metodos para
 * calcular el area y el perimetro 
 * 
 * @version 1.0
 * 
 * @author 
 *
 */


public class Circulo {

	int radio;
	
	/**
	 * Crea un circulo con el radio especificado
	 * 
	 * @param radio		el radio especificado
	 */
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	/**
	 * Crea un circulo con el radio aleatorio
	 * 
	 * @see java.util.Random;
	 * 
	 */
	
	public Circulo() {
		Random numeroAleatorio = new Random();
		this.radio = numeroAleatorio.nextInt(10)+1;
	}
	
	/**
	 * Devuelve el area del circulo
	 * 
	 * @return	el area del circulo
	 */
	
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	/**
	 * Devuelve el perimetro del circulo
	 * 
	 * @return	el perimetro del circulo
	 */
	
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	/**
	 * Devuelve el radio del circulo
	 * 
	 * @return 	el radio del circulo
	 */
	
	public int getRadio() {
		return this.radio;
	}

	/**
	 * Introduce el nuevo valor del radio
	 * 
	 * @param r 	nuevo valor del radio
	 */
	
	public void setRadio(int r) {
		this.radio = r;
	}
	
}
