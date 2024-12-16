package com.mx.Entidad;

public class Turismo extends Vehiculo{

	private int numAsienntos;
	
	//Metodo personalizado
		public String mostrarDatos() {
			return "Vehiculo\n" + "El vehiculo" + this.marca+", submarca "+this.subMarca+" del año"+this.mmodelo+", numero de Asientos"+this.numAsienntos+" esta en venta";
		}

	public Turismo(String marca, String subMarca, int mmodelo, int numAsienntos) {
		super(marca, subMarca, mmodelo);
		this.numAsienntos = numAsienntos;
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", subMarca=" + subMarca + ", mmodelo=" + mmodelo + ", numAsienntos="
				+ numAsienntos + "]";
	}

	public int getNumAsienntos() {
		return numAsienntos;
	}

	public void setNumAsienntos(int numAsienntos) {
		this.numAsienntos = numAsienntos;
	}
	
	
	
}
