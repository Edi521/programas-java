package com.mx.Calculadora;

import java.util.ArrayList;
import java.util.List;

//Despues del nombre de la clase se coloca la palabra reservada "implements", para implementar la interface y despues el nombre de la interface que deseo implementar

public class Implementacion implements IMetodos {

	List<Calculadora>calculadoras = new ArrayList<Calculadora>();
	
	@Override
	public void crear(Calculadora calculadora) {
		// TODO Auto-generated method stub
		calculadoras.add(calculadora);
		
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println(calculadoras);
	}

	@Override
	public void actualizar(int indice,Calculadora calculadora) {
		// TODO Auto-generated method stub
		calculadoras.set(indice, calculadora);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		calculadoras.remove(indice);
		
	}

	@Override
	public Calculadora buscar(int indice) {
		// TODO Auto-generated method stub
		return calculadoras.get(indice);
	}
	
	//Metodos personalizados
	public void contarRegistros() {
		System.out.println("La lista contiene "+calculadoras.size()+"");
	}

	@Override
	public void actualizar(Calculadora calculadora) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
