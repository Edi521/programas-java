package com.mx.Entidad;

import com.mx.Implemantacion.Entregable;

public class Videojuego implements Entregable{

	private String titulo;
	private int horEstimadas = 10;
	private boolean entregado = false;
	private String genero;
	private String compania;
	
	public Videojuego() {
		
	}

	public Videojuego(String titulo, int horEstimadas, boolean entregado, String genero, String compania) {
		this.titulo = "Halo: The Master Chief Collection";
		this.horEstimadas = 42;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}

	public Videojuego(String titulo, int horEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horEstimadas = horEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [Titulo: " + titulo + ", Horas estimadas: " + horEstimadas+" hr" + ", Entregado: " + entregado
				+ ", Genero: " + genero + ", Compañia: " + compania + "]\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorEstimadas() {
		return horEstimadas;
	}

	public void setHorEstimadas(int horEstimadas) {
		this.horEstimadas = horEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	
	
	//Implementacion 
	@Override
	public void entregar() {
		 this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		Videojuego vid = (Videojuego) a;
		return vid.getHorEstimadas();
	}
	
	
	
	
}
