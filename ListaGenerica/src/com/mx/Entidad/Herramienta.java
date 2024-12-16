package com.mx.Entidad;

public class Herramienta extends Item{

	private String marca;
	private int peso;
	private String material;
	
	public Herramienta() {
		
	}

	public Herramienta(int precio, String tipo, String marca, int peso, String material) {
		super(precio, tipo);
		this.marca = marca;
		this.peso = peso;
		this.material = material;
	}


	@Override
	public String toString() {
		return "Herramienta [precio=" + precio + ", tipo=" + tipo + ", marca=" + marca + ", peso=" + peso
				+ ", material=" + material + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
	

}
