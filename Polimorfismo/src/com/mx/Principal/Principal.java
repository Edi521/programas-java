package com.mx.Principal;

import com.mx.Entidad.Deportivo;
import com.mx.Entidad.PickUp;
import com.mx.Entidad.Turismo;
import com.mx.Entidad.Vehiculo;

public class Principal {
	
	public static void main(String[] args) {
		
		Vehiculo []vehiculos = new Vehiculo[4];
		vehiculos[0] = new Vehiculo("Honda", "Civic", 2024);
		vehiculos[1] = new Deportivo("Ford", "GT", 2023, 8);
		vehiculos[2] = new PickUp("Toyota", "Tahoma", 2020, 3000);
		vehiculos[3] = new Turismo("Mercedez-benz", "Spinter", 2021, 30);
		
		for (Vehiculo vehiculo:vehiculos) {
			System.out.println("*********************");
			//System.out.println(vehiculo.mostrarDatos());
			System.out.println(vehiculo.getMarca());
		}
	}
	
}
