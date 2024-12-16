package com.mx.Entidad;

public class Vehiculo {
	
	
	protected String marca;
	protected String subMarca;
	protected int mmodelo;
	
	
	//Metodo personalizado
	public String mostrarDatos() {
		return "Vehiculo\n" + "El vehiculo" + this.marca+", submarca "+this.subMarca+" del año"+this.mmodelo+" esta en venta";
	}
	
	public Vehiculo() {
		
	}

	public Vehiculo(String marca, String subMarca, int mmodelo) {
		this.marca = marca;
		this.subMarca = subMarca;
		this.mmodelo = mmodelo;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", subMarca=" + subMarca + ", mmodelo=" + mmodelo + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubMarca() {
		return subMarca;
	}

	public void setSubMarca(String subMarca) {
		this.subMarca = subMarca;
	}

	public int getMmodelo() {
		return mmodelo;
	}

	public void setMmodelo(int mmodelo) {
		this.mmodelo = mmodelo;
	}

	
	
}
