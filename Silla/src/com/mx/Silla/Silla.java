package com.mx.Silla;

public class Silla {
	
	//Atributos
	
	private String material;
	private String color;
	private String tipo;
	private double precio;
	private int numPatas;
	
	//Constructor
	
	public Silla() {
		
	}
	
	public Silla(String material, String color, String tipo, double precio, int numPatas) {
		this.material = material;
		this.color = color;
		this.tipo = tipo;
		this.precio = precio;
		this.numPatas = numPatas;
	}
	
	//Metodo To_STRING : PARA MOSTRAR LA INFORMACION DE LOS ATRIBUTPS DE FORMATO CADENA ES UNA SOVREESCRITURA DE METODO
	
	public String toString() {
		return "Silla[" + " Material: "+material+", color: "+color+", tipo: "+tipo+", precio: "+precio+", numPatas: "+numPatas+"]";
	}
	
	//Getter y Setter
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo  = tipo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getNumPatas() {
		return numPatas;
	}
	
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

}
