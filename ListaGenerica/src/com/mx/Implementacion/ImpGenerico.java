package com.mx.Implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImpGenerico implements IMetodos{
	
	protected List<Object> objetos = new ArrayList<Object>();

	Scanner datos = null;
	
	@Override
	public void guardar(Object objeto) {
		// TODO Auto-generated method stub
		objetos.add(objeto);
	}

	@Override
	public void editar(int indice, Object objeto) {
		// TODO Auto-generated method stub
		objetos.set(indice, objeto);
		
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		objetos.remove(indice);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return objetos.get(indice);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("En el inventario hay:");
		for (int i = 0; i < objetos.size(); i++) {
			System.out.println("Indice = [ "+i+" ] "+objetos.get(i));
		}
		
	}
	
	public void menuOpciones(String nombre) {
		System.out.println("************** Menu "+nombre+" ***************");
		System.out.println("1. Eliminar\n2. Alta\n3: Salir");
	}
	
	public boolean verificarIndice(int indice) {
		boolean bandera = true;
		
		if(indice >= objetos.size()) {
			System.out.println("El indice no existe");
			bandera = false;
		}else {
			System.out.println("El indice existe");
		}
		return bandera;
	}
	
	public boolean verificarContenido() {
		boolean bandera = true;
				
		if(objetos.isEmpty()) {
			bandera = false;
		}
		return bandera;
	}
	
	public String verificarCadena(String cadena) {

		while(cadena.isBlank()) {
		if(cadena.isBlank()) {
			System.out.println("Escribe una cadena valida");
			datos = new Scanner(System.in);
			cadena = datos.nextLine();
		}
		}
		return cadena;
	}
	
	public int verificarEntero(int entero) {
		
		while(entero == 0) {
		if(entero == 0) {
			System.out.println("Escribe un dato valido");
			datos = new Scanner(System.in);
			entero = datos.nextInt();
		}
		}
		
		return entero;
	}
	
	

}
