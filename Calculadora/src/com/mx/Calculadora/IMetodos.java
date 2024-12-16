package com.mx.Calculadora;


// Interface: Se utiliza para declarar metodos abstractos, define los metodos que una clase debe implementar
public interface IMetodos {

	//Crud: operaciones basicas de crear, leer, actualizar, borrar
	
	public void crear(Calculadora calculadora); 
	
	public void leer();
	
	public void actualizar(int indice,Calculadora calculadora);
	
	public void eliminar(int indice);
	
	public Calculadora buscar(int indice);

	void actualizar(Calculadora calculadora);
	
}
