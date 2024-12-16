package com.mx.Entidad;

public class Deportivo extends Vehiculo{

	private int numCilindros;
	
	//Metodo personalizado
		public String mostrarDatos() {
			return "Vehiculo\n" + "El vehiculo" + this.marca+", submarca "+this.subMarca+" del año"+this.mmodelo+", numero de cilindros"+this.numCilindros+" esta en venta";
		}

	public Deportivo(String marca, String subMarca, int mmodelo, int numCilindros) {
		super(marca, subMarca, mmodelo);
		this.numCilindros = numCilindros;
	}

	@Override
	public String toString() {
		return "Deportivo [marca=" + marca + ", subMarca=" + subMarca + ", mmodelo=" + mmodelo + ", numCilindros="
				+ numCilindros + "]";
	}

	public int getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}
	
	
	
}
