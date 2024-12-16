package com.mx.Herencia;

public class Hijo  extends Padre{
	
	//Atibutos
	private String colorOjos;
	private String complexion;
	
	
	public Hijo() {
		
	}


	public Hijo(String nombre, String apellido, int edad, double altura, String nacional, String colorOjos,
			String complexion) {
		super(nombre, apellido, edad, altura, nacional); //Constructor del padre
		this.colorOjos = colorOjos;
		this.complexion = complexion;
	}


	

	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura
				+ ", nacional=" + nacional + ", colorOjos=" + colorOjos + ", complexion=" + complexion + "]";
	}


	public String getColorOjos() {
		return colorOjos;
	}


	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}


	public String getComplexion() {
		return complexion;
	}


	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}
	
	public void mensaja() {
		System.out.println(nombre+"tiene los ojos de color:" + colorOjos);
	}
	

}