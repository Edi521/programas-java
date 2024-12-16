package com.mx.Entidad;

public class Juguete {
	
	//Atributos
	private int sku; //key del hashMap
	private String nombre;
	private String edades;
	private double precio;
	private String fabricante;
	private String tipo;
	
	public Juguete() {
		
	}

	public Juguete(int sku, String nombre, String edades, double precio, String fabricante, String tipo) {
		this.sku = sku;
		this.nombre = nombre;
		this.edades = edades;
		this.precio = precio;
		this.fabricante = fabricante;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Juguete [sku=" + sku + ", nombre=" + nombre + ", edades=" + edades + ", precio=" + precio
				+ ", fabricante=" + fabricante + ", tipo=" + tipo + "]\n";
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdades() {
		return edades;
	}

	public void setEdades(String edades) {
		this.edades = edades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
