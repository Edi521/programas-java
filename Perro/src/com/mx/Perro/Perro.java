package com.mx.Perro;

public class Perro {

	//Atributos
	
	private String nombre;
	private String raza;
	private String color;
	private int edad;
	private boolean tieneDueño;
	
	
	//constructor por defecto
	public Perro() {
		
	}


	public Perro(String nombre, String raza, String color, int edad, boolean tieneDueño) {
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
		this.tieneDueño = tieneDueño;
	}


	//toString
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", tieneDueño="
				+ tieneDueño + "]\n";
	}


	//GET y SET
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isTieneDueño() {
		return tieneDueño;
	}


	public void setTieneDueño(boolean tieneDueño) {
		this.tieneDueño = tieneDueño;
	}
	
	
	
	
}
