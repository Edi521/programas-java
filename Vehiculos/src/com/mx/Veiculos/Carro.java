package com.mx.Veiculos;

public class Carro extends Veiculo{
	
	private String matricula;
	private int noPuertas;
	
	//Costructor
	public Carro() {
		
	}
	
	public Carro(int vMaxima, int pasajeros, String tipCombustible, String color, String marca, String matricula,
			int noPuertas) {
		super(vMaxima, pasajeros, tipCombustible, color, marca);
		this.matricula = matricula;
		this.noPuertas = noPuertas;
	}



	@Override
	public String toString() {
		return "Carro [aMaxima=" + aMaxima + ", pasajeros=" + pasajeros + ", tipCombustible=" + tipCombustible
				+ ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + ", noPuertas=" + noPuertas
				+ "]\n";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNoPuertas() {
		return noPuertas;
	}

	public void setNoPuertas(int noPuertas) {
		this.noPuertas = noPuertas;
	}
	
	public void creacion() {
		System.out.println("El coche de marca: "+marca+" se creo correctamente con la matricula "+matricula+"\n");
	}
	
	

}
