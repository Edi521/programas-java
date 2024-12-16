package com.mx.Calculadora;

public class Calculadora {
	
	// Atributos
	
	private String marca;
	private String modelo;
	private boolean esCientifica;
	private String color;
	private double precio;
	
	//constructor
	public Calculadora() {
		
	}
	
	
	
	public Calculadora(String marca, String modelo, boolean esCientifica, String color, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.esCientifica = esCientifica;
		this.color = color;
		this.precio = precio;
	}



	//Metodo to String
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", esCientifica=" + esCientifica + ", color="
				+ color + ", precio=" + precio + "]\n";
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isEsCientifica() {
		return esCientifica;
	}

	public void setEsCientifica(boolean esCientifica) {
		this.esCientifica = esCientifica;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
