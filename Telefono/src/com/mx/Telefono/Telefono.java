package com.mx.Telefono;

public class Telefono {
	
	private String marca;
	private float tamPantalla;
	private String color;
	private int tamAlamacenamiento;
	private String tipProcesador;
	
	
	public Telefono() {
		
	}
	
	public Telefono(String marca, float tamPantalla, String color, int tamAlmacenamiento, String tipProcesador) {
		this.marca = marca;
		this.tamPantalla = tamPantalla;
		this.color = color;
		this.tamAlamacenamiento = tamAlmacenamiento;
		this.tipProcesador = tipProcesador;
	}
	
	public String toString() {
		return "Telefono [Marca: "+marca+", Tamaño de pantalla: "+tamPantalla+", Color: "+color+", Tamaño de almacenamiento: "+ tamAlamacenamiento+", Tipo de precesamiento: "+tipProcesador+"]\n";
	}
	
	// Get y Set
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public float getTamPantalla() {
		return tamPantalla;
	}
	
	public void setTamPantalla(float tamPantalla) {
		this.tamPantalla = tamPantalla;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getTamAlmacenamiento() {
		return tamAlamacenamiento;
	}
	
	public void setTamAlmacenamiento(int tamAlmacenamiento) {
		this.tamAlamacenamiento = tamAlmacenamiento;
	}
	
	public String getTipProcesador() {
		return tipProcesador;
	}
	
	public void setTipProcesador(String tipProcesador) {
		this.tipProcesador = tipProcesador;
	}

}
