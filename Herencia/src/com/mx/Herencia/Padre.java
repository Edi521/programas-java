package com.mx.Herencia;

public class Padre {
	
	//Atributo
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double altura;
	protected String nacional;
	
	//constructores
	public Padre() {
		
	}

	public Padre(String nombre, String apellido, int edad, double altura, String nacional) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.nacional = nacional;
	}
	
	
	//Metodo personalizado
	protected void trabajar() {
		System.out.println("Trabajo de 8 a.m a 4p.m");
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura
				+ ", nacional=" + nacional + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNacional() {
		return nacional;
	}

	public void setNacional(String nacional) {
		this.nacional = nacional;
	}
	
	
	
	

}
