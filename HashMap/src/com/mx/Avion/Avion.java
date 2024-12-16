package com.mx.Avion;

public class Avion {
	
	//Atributo
	private int clave; //clave del hashMap
	private String fabricante;
	private String modelo;
	private int pasajeros;
	private String tipo;
	private int numTurbinas;
	
	public Avion() {
		
	}
	
	public Avion(int clave){
		this.clave = clave;
	}

	public Avion(int clave, String fabricante, String modelo, int pasajeros, String tipo, int numTurbinas) {
		this.clave = clave;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.pasajeros = pasajeros;
		this.tipo = tipo;
		this.numTurbinas = numTurbinas;
	}
	
	



	@Override
	public String toString() {
		return "Avion [clave=" + clave + ", fabricante=" + fabricante + ", modelo=" + modelo + ", pasajeros="
				+ pasajeros + ", tipo=" + tipo + ", numTurbinas=" + numTurbinas + "]\n";
	}



	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumTurbinas() {
		return numTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}
	
	
	

}
