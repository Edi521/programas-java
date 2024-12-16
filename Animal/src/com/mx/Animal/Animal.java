package com.mx.Animal;

public class Animal {

	private String especie;
	private String tipAnimal;
	private double tamaño;
	private String habitat;
	private String tipComida;
	
	public Animal() {
		
	}

	public Animal(String especie, String tipAnimal, double tamaño, String habitat, String tipComida) {
		this.especie = especie;
		this.tipAnimal = tipAnimal;
		this.tamaño = tamaño;
		this.habitat = habitat;
		this.tipComida = tipComida;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", tipAnimal=" + tipAnimal + ", tamaño=" + tamaño + ", habitat=" + habitat
				+ ", tipComida=" + tipComida + "]\n";
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTipAnimal() {
		return tipAnimal;
	}

	public void setTipAnimal(String tipAnimal) {
		this.tipAnimal = tipAnimal;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getTipComida() {
		return tipComida;
	}

	public void setTipComida(String tipComida) {
		this.tipComida = tipComida;
	}
	
	
	
	
	
	
	
	
	
	
	
}
