package com.mx.Entidad;

public class Boxeador extends Deportista{
	
	private String categori;

	@Override
	public void entrenar(String deporte) {
		// TODO Auto-generated method stub
		System.out.println("Entreno: "+deporte+" en un GYM");
	}
	
	public Boxeador() {
		
	}

	public Boxeador(String nombre, int edad, String deporte, double altura, String categori) {
		super(nombre, edad, deporte, altura);
		this.categori = categori;
	}

	@Override
	public String toString() {
		return "Boxeador [nombre=" + nombre + ", edad=" + edad + ", deporte=" + deporte + ", altura=" + altura
				+ ", categori=" + categori + "]";
	}

	public String getCategori() {
		return categori;
	}

	public void setCategori(String categori) {
		this.categori = categori;
	}
	
	
	

}
