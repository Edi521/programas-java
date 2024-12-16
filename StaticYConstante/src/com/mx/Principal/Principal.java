package com.mx.Principal;

public class Principal {
	
	
	//miembro estatic
	public static String frase1 = "Miembro estatico";
	
	
	public final String frase2 = "Variable final o constante";
	
	//constante static
	public static final String frase3 = "Variable final ststic";
	
	public static void main(String[] args) {
		
		//modificar 
		frase1 = "Hola mundo";
		
		System.out.println(frase1);
		
		//frase2 = "Hola desde principal";
		// no se permite utilizar ya que no es un miembro estatico
		//System.out.println(frase2);
		
		//frase3 = "Hola usuario";
		
		
		System.out.println(frase3);
		
		double radio = 5;
		double area = 0;
		area = calcularArea(radio);
		System.out.println("El area del circulo con radio "+radio+" es "+area);
		
	}
	
	public static double calcularArea(double radio) {
		
		return Math.PI+(radio*radio);
	}
	

}
