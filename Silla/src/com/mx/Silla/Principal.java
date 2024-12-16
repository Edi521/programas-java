package com.mx.Silla;

public class Principal {

	public static void main(String[] args) {
		
		//intaciar la clase -------- > Crear un objeto
		Silla silla1 = new Silla();
		
		
		silla1.setColor("Cafe");
		silla1.setMaterial("Madera");
		silla1.setTipo("Comedor");
		
		System.out.println("El objeto silla1 es: "+silla1);	
		
		Silla silla2 = new Silla("Metal", "Azul", "Normal", 300, 4);
		
		System.out.println("El objeto silla2 es del material: "+silla2.getMaterial()+"y es de color "+silla2.getColor()+" y cuesta $"+silla2.getPrecio()+" pesos.");
	}
	
}
