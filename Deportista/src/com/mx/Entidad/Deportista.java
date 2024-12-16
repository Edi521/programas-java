package com.mx.Entidad;

public abstract class Deportista {

	protected String nombre;
	protected int edad;
	protected String deporte;
	protected double altura;
	
	public abstract void entrenar(String deporte);
	
	public void experiencia(int ganado,String premios) {
		System.out.println("He ganado " + ganado+" " + premios+"\n");
	}
	
	public Deportista() {
		
	}

	public Deportista(String nombre, int edad, String deporte, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.deporte = deporte;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", edad=" + edad + ", deporte=" + deporte + ", altura=" + altura + "]\n";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getDeporte() {
		return deporte;
	}



	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	
}
