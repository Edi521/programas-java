package com.mx.Entidad;

import com.mx.Implemantacion.Entregable;

public class Serie implements Entregable{

	
	private String titulo;
	private int noTemporradas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	//Constructores
	public Serie() {
		
	}

	public Serie(String titulo, int noTemporradas, boolean entregado, String genero, String creador) {
		this.titulo = "Stranger Things";
		this.noTemporradas = noTemporradas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = "Hermanos Duffer";
	}


	public Serie(String titulo, int noTemporradas, String genero, String creador) {
		this.titulo = titulo;
		this.noTemporradas = noTemporradas;
		this.genero = genero;
		this.creador = creador;
	}

	
	//To String
	@Override
	public String toString() {
		return "Serie [Titulo: " + titulo + ", Temporradas: " + noTemporradas + ", Entregado: " + entregado + ", Genero: "
				+ genero + ", Creador: " + creador + "]\n";
	}
	
	
	
	//Get y Set
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNoTemporradas() {
		return noTemporradas;
	}

	public void setNoTemporradas(int noTemporradas) {
		this.noTemporradas = noTemporradas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	//Implementaciones
	
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
		// TODO Auto-generated method stub
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
		Serie ser = (Serie) a;
		return ser.getNoTemporradas();
	}
	
	
	
	
	
	
}
