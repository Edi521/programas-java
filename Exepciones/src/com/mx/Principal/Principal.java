package com.mx.Principal;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		Funcion funcion = new Funcion();
		
		String url = "C:\\Users\\heyed\\Desktop\\Curso enucom 2024\\Semana 1 POO\\Recursos\\Excepcion.txt";
	try {
		funcion.leer(url);
	}catch(FileNotFoundException e) {
		System.out.println("El archivo no se encontro verifique la ruta\n"+e.getMessage());
	}catch(IOException e) {
		System.out.println("Ocurrio una excepcion general.\nError:"+e.getMessage());
	}
	
	
	try {
		funcion.dividir(50, 0);
	}catch(ArithmeticException e) {
		System.out.println("La operacion no es valida, porque divides entre 0.\nError: "+e.getMessage());
	}
	
	
	}
	
	
}
