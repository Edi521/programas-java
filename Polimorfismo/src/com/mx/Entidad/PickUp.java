package com.mx.Entidad;

public class PickUp extends Vehiculo{

	private int capacidadCarga;
	
	//Metodo personalizado
		public String mostrarDatos() {
			return "Vehiculo\n" + "El vehiculo" + this.marca+", submarca "+this.subMarca+" del año"+this.mmodelo+", capcidad de carga "+this.capacidadCarga+" esta en venta";
		}

	public PickUp(String marca, String subMarca, int mmodelo, int capacidadCarga) {
		super(marca, subMarca, mmodelo);
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return "PickUp [marca=" + marca + ", subMarca=" + subMarca + ", mmodelo=" + mmodelo + ", capacidadCarga="
				+ capacidadCarga + "]";
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
	
	
	
	
}
