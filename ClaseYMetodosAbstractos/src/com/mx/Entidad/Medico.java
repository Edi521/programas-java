package com.mx.Entidad;

public class Medico extends Profesionista{

	private String especialidad;
	private String consultorio;
	private double cobroConsulta;
	
	public void trabajar() {
		System.out.println("Trabajo en turnos nocturnos");
	}
	
	public Medico() {
		
	}

	public Medico(String nombre, String apellido, int edad, int cedula, String universidad, int experiencia,
			String especialidad, String consultorio, double cobroConsulta) {
		super(nombre, apellido, edad, cedula, universidad, experiencia);
		this.especialidad = especialidad;
		this.consultorio = consultorio;
		this.cobroConsulta = cobroConsulta;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", experiencia=" + experiencia + ", especialidad=" + especialidad
				+ ", consultorio=" + consultorio + ", cobroConsulta=" + cobroConsulta + "]\n";
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	public double getCobroConsulta() {
		return cobroConsulta;
	}

	public void setCobroConsulta(double cobroConsulta) {
		this.cobroConsulta = cobroConsulta;
	}
	
	
	
}
