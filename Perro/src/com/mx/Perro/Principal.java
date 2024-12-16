package com.mx.Perro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//instanciar clase
		
		Perro perro1 = new Perro("PELUSA", "FRENCH", "BLANCO", 2, false);
		Perro perro2 = new Perro("Toby","cooker","Cafe-miel",2,true);
		var perro3 = new Perro("Caramelo", "tacita de te", "Cafe", 5, true);
		Perro perro4 = new Perro ("Moka","Yorkterrier","moka con blanco",5,false);
		Perro perro5 = new Perro("Guardian", "Pastor Belga", "Café", 3, true);
		Perro perro6 = new Perro("COCO","MALTES","CREMA",2,true);
		
		//crear un objeto auxiliar
		Perro perro = null;
		
		//Instaciar la lista
		//List se importa de java util
		//Lo que se va alamacenar ---> perro
		//Nombre de la lista
		//inicializacion
		List<Perro> perros = new ArrayList<Perro>();
		
		//Agregar elementos a la lista
		perros.add(perro1);
		perros.add(perro2);
		perros.add(perro3);
		perros.add(perro4);
		
		/*System.out.println("Los datos de la lista son:\n "+perros);
		
		//Buscar un elemento
		perro = perros.get(2);
		System.out.println("Elemnto encontrado: \n "+perro);
		
		//Editar un elemento de la lista
		perro = perros.get(0);
		perro.setEdad(4);
		perro.setTieneDueño(true);
		perro.setColor("Arena");
		perros.set(0, perro); 
		
		System.out.println("Los datos actualizados son: \n"+perros);
		
		//Eliminar un elemnto de la lista
		perro = perros.get(3);
		perros.remove(3);
		System.out.println("Elemento elliminado: \n"+perro);
		System.out.println("lista actualizada: \n"+perros);
		
		//Eliminar todos los elementos
		//perros.clear();
		
		//Validar si la lista es vacia
		if(perros.isEmpty()) {
			System.out.println("Lista vacia: "+perros);
		}else {
			System.out.println("La lista contiene "+perros.size()+" perro(s)");
		}*/
		
		
		//Crear una variable para leer desde teclado
		Scanner scan = null;
		int menuP = 0, menuE = 0, indice = 0,edad = 0;
		String nombre,raza,color;
		boolean tieneDuenio;
		do {
			System.out.println("------------------ Menu ------------");
			System.out.println("1: Alta");
			System.out.println("2: Mostrar");
			System.out.println("3: Editar");
			System.out.println("4: Buscar");
			System.out.println("5: Eliminar");
			System.out.println("6: Contar");
			System.out.println("7: Salir");
			System.out.println("Elige una opcion:");
			scan = new Scanner(System.in);
			menuP = scan.nextInt();
			
			switch (menuP) {
			case 1: 
				System.out.println("------------- Dar de alta un perro ------------");
				System.out.println("Escribe el nombre del perro: ");
				scan = new Scanner(System.in);
				nombre = scan.nextLine();
				
				System.out.println("Escribe la raza del perro: ");
				scan = new Scanner(System.in);
				raza = scan.nextLine();
				
				System.out.println("Escribe el color del perro: ");
				scan = new Scanner(System.in);
				color = scan.nextLine();
				
				System.out.println("Escribe la edad del perro: ");
				scan = new Scanner(System.in);
				edad = scan.nextInt();
				
				System.out.println("¿Tiene dueño?, Escribe si o no");
				scan = new Scanner(System.in);
				String respuesta = scan.nextLine();
				if(respuesta.equalsIgnoreCase("si")) {
					tieneDuenio = true;
				}else {
					tieneDuenio = false;
				}
				
				//instanciar la clase
				perro = new Perro(nombre,raza,color,edad,tieneDuenio);
				
				//agregar a la lista
				perros.add(perro);
				
				System.out.println("El registro fue exitoso del perro: \n"+perro.getNombre());
				
				break;
				
			case 2:
					System.out.println("------- Mostrar elementos ------");
					System.out.println("La informacion almacenada es: \n" + perros);
					break;
			case 3:
				System.out.println("------ Editar elemento -------");
				System.out.println("Imprimir el indice del elemento a editar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				
				perro = perros.get(indice);
				do {
					System.out.println("Opcion para editar un perro:\n ");
					System.out.println("1: Editar el color");
					System.out.println("2: Tiene dueño");
					System.out.println("3: Regresar al menu principal");
					System.out.println("Elija una opcion: ");
					scan = new Scanner(System.in);
					menuE = scan.nextInt();
					switch(menuE) {
					case 1:
						System.out.println("Escribe el nuevo color del perro: ");
						color = scan.nextLine();
						perro.setColor(color);
						perros.set(indice, perro);
						System.out.println("Se modifico el color correctamente");
						break;
					case 2:
						System.out.println("¿Tiene dueño el perro?"+ perro.getNombre()+"? Escribe si o no");
						scan = new Scanner(System.in);
						String res = scan.nextLine();
						if(res.equalsIgnoreCase("si")) {
							tieneDuenio = true;
						}else {
							tieneDuenio = false;
						}
						break;
					case 3:
						System.out.println("Regresamos al menu principla.\n");
						break;
					default:
						System.out.println("Opcion no valida, elige una opcion entre el rango.");
						break;
					}
				}while(menuE != 3);
				break;
				
			case 4: 
				System.out.println("------------ Buscar un elemento -------------");
				System.out.println("¿Cual es el indice para buscar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				perro = perros.get(indice);
				System.out.println("Elemento encontrado: \n"+perro);
				break;
			case 5:
				System.out.println("------ Eliminar elemento ---------");
				System.out.println("¿Que perro desea eliminar?");
				scan = new Scanner(System.in);
				perro = perros.get(indice);
				perros.remove(indice);
				System.out.println("El perro "+ perro.getNombre() + "ha sido eliminado");
				break;
				
			case 6:
				System.out.println("---------- Contar elementos ------------");
				System.out.println("El numero total de perros es: "+perros.size());
				break;
			case 7:
				System.out.println("Saliendo ................ ¡Hasta Luego!");
				break;
			default:
				System.out.println("Elige una opcion valida, inetenta de nuevo");
				break;
			}
		}while(menuP != 7);
	}
}
