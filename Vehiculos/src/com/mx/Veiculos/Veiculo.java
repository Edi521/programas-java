package com.mx.Veiculos;

public class Veiculo {
	
	//Atributos
	
	protected int aMaxima;
	protected int pasajeros;
	protected String tipCombustible;
	protected String color;
	protected String marca;
	
	//Contructores
	public Veiculo(){
		
	}

	public Veiculo(int aMaxima, int pasajeros, String tipCombustible, String color, String marca) {
		this.aMaxima = aMaxima;
		this.pasajeros = pasajeros;
		this.tipCombustible = tipCombustible;
		this.color = color;
		this.marca = marca;
	}

	
	//Metodo to String
	@Override
	public String toString() {
		return "Veiculo [vMaxima=" + aMaxima + ", pasajeros=" + pasajeros + ", tipCombustible=" + tipCombustible
				+ ", color=" + color + ", marca=" + marca + "]\n";
	}
	
	
	//Metodos personalizados
	public void arrancar() {
		System.out.println(" El carro esta avanzando");
	}
	
	public void frenar() {
		System.out.println("El carro esta frenando");
	}
	
	//get y set
	public int getAMaxima() {
		return aMaxima;
	}

	public void setAMaxima(int aMaxima) {
		this.aMaxima = aMaxima;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getTipCombustible() {
		return tipCombustible;
	}

	public void setTipCombustible(String tipCombustible) {
		this.tipCombustible = tipCombustible;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

	
	
	
	

}
