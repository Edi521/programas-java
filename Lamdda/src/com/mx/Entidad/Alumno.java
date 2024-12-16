package com.mx.Entidad;

public class Alumno {

	private int matricula;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private int edad;
	private String carrera;
	private String universidad;
	
	
	public Alumno() {
		
	}
	
	public Alumno(int matricula, String nombre, String apellidoP, String apellidoM, int edad, String carrera,
			String universidad) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.edad = edad;
		this.carrera = carrera;
		this.universidad = universidad;
	}

	@Override
	public String toString() {
		return "Alumno [matricula:" + matricula + ", nombre:" + nombre + ", apellidoP:" + apellidoP + ", apellidoM:"
				+ apellidoM + ", edad:" + edad + ", carrera:" + carrera + ", universidad:" + universidad + "]\n";
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
