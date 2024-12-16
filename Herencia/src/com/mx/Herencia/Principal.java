package com.mx.Herencia;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Hijo hijo = new Hijo("Juan", "Sanchez", 19, 1.10, "Mexicana", "Negro", "Delgado");
		
		System.out.println(hijo);
		hijo.mensaja();
		
		
		hijo.setAltura(1.80);
		System.out.println(hijo);
		
		
		hijo.trabajar();
		
	}
	

}
