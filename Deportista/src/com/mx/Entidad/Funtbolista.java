package com.mx.Entidad;

public class Funtbolista extends Deportista{

	private String equipo;
	
	
	@Override
	public void entrenar(String deporte) {
		// TODO Auto-generated method stub
		System.out.println("Entreno: "+deporte+" en un equipo");
	}

	public Funtbolista() {
		
	}

	public Funtbolista(String nombre, int edad, String deporte, double altura, String equipo) {
		super(nombre, edad, deporte, altura);
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Funtbolista [nombre=" + nombre + ", edad=" + edad + ", deporte=" + deporte + ", altura=" + altura
				+ ", equipo=" + equipo + "]";
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	
	
	
	
}
