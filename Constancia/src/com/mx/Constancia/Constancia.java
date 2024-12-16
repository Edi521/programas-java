package com.mx.Constancia;

public class Constancia {
	
	private String nombre;
	private int duracion;
	private String nomCurso;
	private String fecha;
	
	public Constancia() {
		
	}
	
	public Constancia(String nombre) {
		this.nombre = nombre;
	}

	public Constancia(String nombre, int duracion, String nomCurso, String fecha) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.nomCurso = nomCurso;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Constancia [nombre=" + nombre + ", duracion=" + duracion + ", nomCurso=" + nomCurso
				+ ", fecha=" + fecha + "]\n";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getNomCurso() {
		return nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
