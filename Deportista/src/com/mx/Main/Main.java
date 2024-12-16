package com.mx.Main;

import com.mx.Entidad.Boxeador;
import com.mx.Entidad.Funtbolista;

public class Main {
	
	
	public static void main(String[] args) {
		
		Funtbolista fut = new Funtbolista("Messi", 37, "Futbol", 1.70, "Inter Miami CF");
		System.out.println(fut);
		fut.entrenar(fut.getDeporte());
		fut.experiencia(30, "partidos");
		
		Boxeador box = new Boxeador("Canelo", 34, "Box", 1.71, "Peso mediano");
		System.out.println(box);
		box.entrenar(box.getDeporte());
		box.experiencia( 5, "cinturones");
		
		
	}//Main
	

}
