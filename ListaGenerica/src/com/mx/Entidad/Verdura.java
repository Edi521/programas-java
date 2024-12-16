package com.mx.Entidad;

public class Verdura extends Item{
	
	private String color;
	private int peso;
	private String forma;
	
	public Verdura() {
		
	}


	public Verdura(int precio, String tipo, String color, int peso, String forma) {
		super(precio, tipo);
		this.color = color;
		this.peso = peso;
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Verdura [precio=" + precio + ", tipo=" + tipo + ", color=" + color + ", peso=" + peso + ", forma="
				+ forma + "]";
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
	
	
	

}
