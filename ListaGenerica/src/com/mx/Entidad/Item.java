package com.mx.Entidad;

public class Item {
	
	protected int precio;
	protected String tipo;
	
	public Item() {
		
	}

	public Item(int precio, String tipo) {
		this.precio = precio;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Item [precio=" + precio + ", tipo=" + tipo + "]";
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
