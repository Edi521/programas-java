package com.mx.Pokemon;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	private int ps;
	private int nivel;
	private boolean tObjeto = false;
	
	//Constructor
	public Pokemon() {
		
	}

	public Pokemon(String nombre, String tipo, int ps, int nivel, boolean tObjeto) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ps = ps;
		this.nivel = nivel;
		this.tObjeto = tObjeto;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", ps=" + ps + ", nivel=" + nivel + ", tObjeto="
				+ tObjeto + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean gettObjeto() {
		return tObjeto;
	}

	public void settObjeto(boolean tObjeto) {
		this.tObjeto = tObjeto;
	}
	
	
	
	

}
