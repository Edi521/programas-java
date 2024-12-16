package com.mx.Principal;

import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Alumno;

public class Principal {

	
	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(new Alumno(3173, "Oscar", "Chavez", "Gonzalez", 21, "Economia", "UNAM"));
		alumnos.add(new Alumno(4148, "Annet", "Hermnandez", "Morales", 24, "Diseño industrial", "UNAM"));
		alumnos.add(new Alumno(1010, "Maria", "Morales", "Rosas", 20, "Derecho", "UNAM"));
		alumnos.add(new Alumno(1080, "Jose", "Hernandez", "Hernandez", 22, "Informatica", "BUAP"));
		alumnos.add(new Alumno(1702, "Guillermo", "Hidalgo", "Navarro", 23, "Criminalistica", "UAM"));
		alumnos.add(new Alumno(2003, "Esmeralda", "Macias", "Perez", 21, "Turismo", "IPN"));
		alumnos.add(new Alumno(1030, "Juan", "Lopez", "Martinez", 23, "Computacion", "IPN"));
		alumnos.add(new Alumno(1020, "Angeles", "Lucas", "Juarez", 21, "Administracion", "UAM"));
		alumnos.add(new Alumno(2064, "Jessica", "Martinez", "Mendoza", 19, "Medicina", "UNAM"));
		alumnos.add(new Alumno(2168, "Ana", "Aguilar", "Hernandez", 20, "Administracion", "UVM"));
		alumnos.add(new Alumno(1050,"Uriel","Flores","Morales",28,"Electronica","BUAP"));
		alumnos.add(new Alumno(1040,"Miguel","Perez","Reyes",25,"Biomedico","UDLAP"));
		
		//Metodo de lista
		alumnos.forEach(
				//Expresion lamdda
				(alumno) -> {System.out.println("Nombre del alumno: "+alumno.getNombre());}
				);
		
		System.out.println("\nDetalle del alumno de la universida UNAM:");
		//Imprimir la informacion del alumno aplicando filtros
		alumnos.stream().filter(
				(alum) -> alum.getUniversidad().equalsIgnoreCase("unam")
				).forEach(
						alumno -> System.out.println("Nombre: "+alumno.getNombre()+" Carrera: "+
				alumno.getCarrera()+" Universidad: "+alumno.getUniversidad())
						
				);
		
		//expresion lambda utilizando interface funcional
		ISaludo mensaje = (saludo) -> {return saludo;};
		System.out.println("\n\nExpresion lamdda con 1 parametro: \n"+mensaje.saludar("Hola con expresiones lambda"));
		
		
		
	}//Main
}
