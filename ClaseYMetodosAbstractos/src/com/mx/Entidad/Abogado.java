package com.mx.Entidad;

public class Abogado extends Profesionista{
	
	private String tipo;
	private String despacho;
	private double honorarios;

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajo durante el dia");
	}
	
	public Abogado() {
		
	}

	public Abogado(String nombre, String apellido, int edad, int cedula, String universidad, int experiencia,
			String tipo, String despacho, double honorarios) {
		super(nombre, apellido, edad, cedula, universidad, experiencia);
		this.tipo = tipo;
		this.despacho = despacho;
		this.honorarios = honorarios;
	}

	@Override
	public String toString() {
		return "Abogado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", experiencia=" + experiencia + ", tipo=" + tipo + ", despacho="
				+ despacho + ", honorarios=" + honorarios + "]\n";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}

	
	
	
	

}
