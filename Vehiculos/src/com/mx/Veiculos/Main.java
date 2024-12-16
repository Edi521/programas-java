package com.mx.Veiculos;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro(100, 4, "Gasolina", "Negro", "Ford", "AWX120", 4);
		
		carro.creacion();
		System.out.println(carro);
		
		carro.setColor("Rojo");
		System.out.println(carro);
		
		String estadoCarro = "avanzando";
		
		if(estadoCarro.equals("avanzando")) {
			carro.arrancar();
		}else {
			if(estadoCarro.equals("frenando")) {
				carro.frenar();
			}
		}
				
		
		
	}
}
