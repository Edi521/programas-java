package com.mx.Pokemon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Pokemon p1 = new Pokemon("Charizard", "Fuego", 78, 50, false);
		Pokemon p2 = new Pokemon("Gyarados", "Agua", 95, 50, true);
		Pokemon p3 = new Pokemon("Alakazam", "Psiquico", 55, 50, false);
		
		Pokemon pokemon = null;
		//Pokemon pokemon1 = null;
		
		Implementacion imp = new Implementacion();
		
		
		//Agregar pokemones a la lista
		imp.crear(p1);
		imp.crear(p2);
		imp.crear(p3);
		
	/*    //Mostrar pokemones
		imp.leer();
		
		
		//Buscar pokemon
		int buscar = 0;
		pokemon = imp.buscar(buscar);
		System.out.println("Este es el pokemon encontrado\n"+pokemon);
		
		//Editar pokemon
		int editar = 1;
		pokemon = imp.buscar(editar);
		pokemon.setPs(150);
		pokemon.settObjeto(false);
		System.out.println("se edito a: "+pokemon.getNombre());
		imp.actualizar(editar, pokemon);
		imp.leer();
		
		//Eliminar pokemon
		int eliminar = 2;
		imp.eliminar(eliminar);
		imp.leer();
		
		//Peleas pokemon
		int peleador1 = 0;
		pokemon = imp.buscar(peleador1);
		int peleador2 = 1;
		pokemon1 = imp.buscar(peleador2);
		System.out.println("Pelea pkemon entre: "+pokemon.getNombre()+" y "+pokemon1.getNombre());
		imp.pelear(pokemon, pokemon1);
		
		*/
		
		//Variables locales
		String nombre = null,tipo=null;
		
		int menuP = 0, menuE = 0, ps = 0, indice = 0;
		Integer nivel;
		boolean tObjeto = false;
		Scanner datos = null;
		
		
		do {
			
			System.out.println("------------------ MENU PRINCIPAL------------");
			System.out.println("\n1: DAR DE ALTA\n2: EDITAR\n3: Buscar\n4: Mostrar\n5: Contar\n6: Eliminar\n7: Salir");
			
			datos = new Scanner(System.in);
			menuP = datos.nextInt();
			
			switch (menuP) {
			case 1:
				
				System.out.println("--------------- ALTA ----------------");
				System.out.println("Llene los siguientes datos");
				System.out.println("Nombre");
				datos = new Scanner(System.in);
				nombre = datos.nextLine();

				
				
				System.out.println("Tipo");
				datos = new Scanner(System.in);
				tipo = datos.nextLine();
				
				System.out.println("Nivel");
				datos = new Scanner(System.in);
				nivel = datos.nextInt();
				
				System.out.println("PS");
				datos = new Scanner(System.in);
				ps = datos.nextInt();
				
				System.out.println("¿Tiene algun objeto?    si/no");
				datos = new Scanner(System.in);
				String respuesta = datos.nextLine();
				if(respuesta.equalsIgnoreCase("si")) {
					tObjeto = true;
				}else {
					tObjeto = false;
				}
				
				pokemon = new Pokemon(nombre, tipo, ps, nivel, tObjeto);
				imp.verificarPokemon(pokemon);

				imp.crear(pokemon);
				imp.leer();

				break;
				
			case 2:
				do {
					System.out.println("------------------------- Editar ------------------------");
					if(!imp.pokemones.isEmpty()) {
					System.out.println("1: PS\n2:Objeto\n3:salir");
					datos = new Scanner(System.in);
					menuE = datos.nextInt();
					
						switch (menuE) {
						case 1:
							System.out.println("Cual es el indice del pokemon que quieres modificar");
							imp.leer();
							datos = new Scanner(System.in);
							int i = datos.nextInt();
							imp.regresarIndice(i);
							i = imp.regresarIndice(i);
							pokemon = imp.buscar(i);
							System.out.println("¿Cual es el nuevo Ps de: "+pokemon.getNombre()+" ?");
							ps = datos.nextInt();
							pokemon.setPs(ps);
							imp.actualizar(i, pokemon);
							System.out.println("se edito a: "+pokemon.getNombre()+" \nNuevo ps: "+pokemon.getPs());
							break;
						case 2:
							System.out.println("Cual es el indice del pokemon que quieres modificar");
							imp.leer();
							datos = new Scanner(System.in);
							int j = datos.nextInt();
							imp.regresarIndice(j);
							j = imp.regresarIndice(j);
							pokemon = imp.buscar(j);
							System.out.println("El pokemon tiene un objeto? si/no");
							datos = new Scanner(System.in);
							String res = datos.nextLine();
							if(res.equalsIgnoreCase("si")) {
								pokemon.settObjeto(true);
								System.out.println("Tu pokemon: "+pokemon.getNombre()+" Ya tiene objeto");
							}else {
								pokemon.settObjeto(false);
							}
							break;
							
						case 3:
							System.out.println("Saliendo ...........");
							break;
						default:
							System.out.println("Error");
							break;
						}
					}else {
						System.out.println("No hay pokemones");
					}
					break;
					
				} while (menuE != 3);
				break;
				
			case 3:
			do {
				System.out.println("------------------ Buscar -----------------");
				System.out.println("1: por tipo\n2:por indice\n3:Salir");
				datos = new Scanner(System.in);
				menuE = datos.nextInt();
				
				switch (menuE) {
				case 1:
					System.out.println("¿Cual es el tipo del pokemon que buscas?");
					datos = new Scanner(System.in);
					tipo = datos.nextLine();
					imp.buscarTipo(tipo);
					
					break;
				case 2:
					System.out.println("Cual es el indice del pokemon que quieres ver?");
					imp.mostrarIndice();
					datos = new Scanner(System.in);
					try {
						indice = datos.nextInt();
					}catch (InputMismatchException e) {
						// TODO: handle exception
						System.out.println("El indice no es valido\n Error"+e.getMessage());
					}
					indice = imp.regresarIndice(indice);
					System.out.println( imp.buscar(indice)); 
					break;
					
				case 3:
					System.out.println("Saliendo...........");
					break;
				default:
					System.out.println("Error");
					break;
				}
				

				
			} while (menuE != 3);
				break;
				
			case 4:
				System.out.println("Tienes estos pokemones en tu pokedex\n");
				imp.leer();
				break;
				
			case 5:
				System.out.println("Exixten: "+imp.pokemones.size()+ " en la pokedex");
				break;
				
			case 6:
				do {
					System.out.println("----------------- Eliminar ------------");
					System.out.println("1: Eliminar todo\n2: Por indice\n3: Eliminar por tipo\n4: Salir");
					datos = new Scanner(System.in);
					menuE = datos.nextInt();
					
					switch (menuE) {
					case 1:
						imp.pokemones.clear();
						System.out.println("Los pokemones se eliminaron"+ imp.pokemones);
						break;
					case 2:
						System.out.println("¿Cual es el indice del pokemon que quieres eliminar?");
						imp.leer();
						datos = new Scanner(System.in);
						indice = datos.nextInt();
						imp.regresarIndice(indice);
						indice = imp.regresarIndice(indice);
						pokemon = imp.buscar(indice);
						imp.eliminar(indice);
						System.out.println("Se elimino a: "+pokemon.getNombre());
						imp.leer();
						break;
					case 3:
						boolean bandera = false;
						System.out.println("¿Cual es el tipo del pokemon que quieres eliminar?");
						imp.leer();
						datos = new Scanner(System.in);
						tipo = datos.nextLine();
						bandera =imp.buscarTipo(tipo);
						if(bandera == true) {
							imp.eliminarTipo(tipo);
						}
						break;
						
						
					case 4:
						System.out.println("Saliendo .........");
						break;
					default:
						System.out.println("Error");
						break;
					}
					
				} while (menuE != 4);
				break;
				
			case 7: 
				System.out.println("Saliendo del sistema...........");
				break;

			default:
				System.out.println("Error");
				break;
			}// menu principal	
			
		} while (menuP != 7);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
