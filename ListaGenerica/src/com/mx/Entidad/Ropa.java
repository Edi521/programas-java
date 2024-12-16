package com.mx.Entidad;

public class Ropa extends Item{
	
	private String color;
	private String talla;
	private String material;
	
	
	public Ropa() {
		
	}


	


	public Ropa(int precio, String tipo, String color, String talla, String material) {
		super(precio, tipo);
		this.color = color;
		this.talla = talla;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Ropa [precio=" + precio + ", tipo=" + tipo + ", color=" + color + ", talla=" + talla + ", material="
				+ material + "]";
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
	
	
	
	
	
	
	

}
