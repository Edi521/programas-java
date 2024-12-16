package com.mx.Entidad;

public class Videojuego {
	
	private String nombre;
	private String categoria;
	private String compania;
	private int anio;
	private double precio;
	private String clasificacion;
	
	public Videojuego() {
		
	}

	public Videojuego(String nombre, String categoria, String compania, int anio, double precio, String clasificacion) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.compania = compania;
		this.anio = anio;
		this.precio = precio;
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", categoria=" + categoria + ", compania=" + compania + ", anio=" + anio
				+ ", precio=" + precio + ", clasificacion=" + clasificacion + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	
	
	

}
