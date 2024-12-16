package com.mx.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Animal anim1 = new Animal("mamifero","lobo",0.85,"bosque","carne");
		Animal anim2 = new Animal("anfibio", "ajolote", 0.23, "lago", "carne");
		Animal anim3 = new Animal("ave", "pinguino", 1.2, "antartida", "peces");
		Animal anim4 = new Animal("reptil", "boa constrictor", 4.0, "selvas", "carne");
		Animal anim5 = new Animal("pez", "tiburon blanco", 6.0, "oceanos", "carne");
		
		
		
		Animal anim = null;
		
		List<Animal>animales = new ArrayList<Animal>();
		
		animales.add(anim1);
		animales.add(anim2);
		animales.add(anim3);
		animales.add(anim4);
		animales.add(anim5);
		
		//System.out.println(animales); //Verificando el add a mi lista
		
		
		//Sub menu
		
		Scanner scan = null;
		
		String especie, tipAnimal, habitat,tipComida;
		double tamaño;
		int menuP = 0, menuE = 0,indice = 0;
		
		do {
			System.out.println("---- Bienvenido al menu principa -----");
			System.out.println("Escoge alguna opcion");
			System.out.println("1: Dar de alta un animal\n"+
							   "2: Mostrar animales\n"+
							   "3: Editar animal\n"+
							   "4: Buscar animal\n"+
							   "5: Eliminar animal\n"+
							   "6: Contar\n"+
							   "7: Validar\n"+
							   "8: Salir");

			scan = new Scanner(System.in);
			menuP = scan.nextInt();
			
			switch (menuP) { //inicio menu principal
			
			case 1:
				System.out.println("Da de alta a un animal");
				System.out.println("¿Caul es su especie?");
				scan = new Scanner(System.in);
				especie = scan.nextLine();
				
				System.out.println("¿Que animal es?");
				scan = new Scanner(System.in);
				tipAnimal = scan.nextLine();
				
				System.out.println("¿Cuanto mide el animal?");
				scan = new Scanner(System.in);
				tamaño = scan.nextDouble();
				
				System.out.println("¿Cual es su habitat?");
				scan = new Scanner(System.in);
				habitat = scan.nextLine();
				
				System.out.println("¿Que come el anima?");
				scan = new Scanner(System.in);
				tipComida = scan.nextLine();
				
				anim = new Animal(especie, tipAnimal, tamaño, habitat, tipComida); //Creando un nuevo animal
				
				animales.add(anim); //añadiendo mi animal a mi lista
				
				System.out.println("Se acaba de agregal el animal: "+anim.getTipAnimal());
				break;
				
			case 2:
				System.out.println("Los animales almacenados son:\n "+animales);
				break;
				
			case 3:
				System.out.println("¿Cual es el indice del animal que quiere editar?");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				anim = animales.get(indice);
				do {
					System.out.println("El animal a modificar es: "+anim.getTipAnimal()+"\n Escoje una opcion para editar\n"+
							"1: especie\n"+
							"2: tipo de anima\n"+
							"3: tamaño del animal\n"+
							"4: habitat del animal\n"+
							"5: tipo de comida del animal\n"+
							"6: salir");
					scan = new Scanner(System.in);
					menuE = scan.nextInt();
					switch (menuE) {
					case 1: 
						System.out.println("¿Caul es su especie?");
						scan = new Scanner(System.in);
						especie = scan.nextLine();
						anim.setEspecie(especie);
						animales.set(indice, anim);
						System.out.println("Se actualizo la especie del animal");
					break;
					
					case 2: 
						System.out.println("¿Que animal es?");
						scan = new Scanner(System.in);
						tipAnimal = scan.nextLine();
						anim.setTipAnimal(tipAnimal);
						animales.set(indice, anim);
					break;
					case 3:
						System.out.println("¿Cuanto mide el animal?");
						scan = new Scanner(System.in);
						tamaño = scan.nextDouble();
						anim.setTamaño(tamaño);
						animales.set(indice, anim);
					break;
					case 4: 
						System.out.println("¿Cual es su habitat?");
						scan = new Scanner(System.in);
						habitat = scan.nextLine();
						anim.setTipAnimal(habitat);
						animales.set(indice, anim);
						break;
					case 5: 
						System.out.println("¿Que comida come?");
						scan = new Scanner(System.in);
						tipComida = scan.nextLine();
						anim.setTipAnimal(tipComida);
						animales.set(indice, anim);
						break;
					case 6: 
						System.out.println("Saliendo de edicion");
					default:
						System.out.println("No existe la opcion");
					break;
					}
					
				} while (menuE != 6);
				break;
					
			case 4:
				do {
					System.out.println("------- Buscador de animales --------");
					System.out.println("1: Buscar animal por indice\n"+
									   "2: BUscar animal por atributo\n"+
									   "3: Salir");
					scan = new Scanner(System.in);
					menuE = scan.nextInt();
					
					switch (menuE) {
					case 1:
						System.out.println("¿Cual es el indice del animal que quieres mostrar");
						scan = new Scanner(System.in);
						indice = scan.nextInt();
						anim = animales.get(indice);
						System.out.println("Este es el animal resultante de la busqueda\n"+anim);
						break;

					case 2:
						do {System.out.println("cual es el atributo que quiere utilizar\n 1:especie\n 2:tipo de animal\n 3: tamaño del aniimal\n 4:habitat del animal\n 5:tipo de comida\n 6: salir");
						scan = new Scanner(System.in);
						menuE = scan.nextInt();
						
						switch (menuE) {
						case 1:
							System.out.println("Cual es la especie que buscas: ");
							scan = new Scanner(System.in);
							especie = scan.nextLine();
							System.out.println("Los animales encontrados son:\n");
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String especies = anim.getEspecie();
								if(especies.equals(especie)) {
									System.out.println(anim);
								}else {}
								
							}
							break;
							
						case 2: 
							System.out.println("Cual es el animal que buscas: ");
							scan = new Scanner(System.in);
							tipAnimal = scan.nextLine();
							System.out.println("Los animales encontrados son:\n");
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String especies = anim.getTipAnimal();
								if(especies.equals(tipAnimal)) {
									System.out.println(anim);
								}else {}
							}
							
						break;
							
						case 3:
							System.out.println("Cual es el tamaño del animal que buscas: ");
							scan = new Scanner(System.in);
							tamaño = scan.nextDouble();
							System.out.println("Los animales encontrados son:\n");
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								double tamanos = anim.getTamaño();
								if(tamanos == tamaño) {
									System.out.println(anim);
								}else {}
							}
							
						break;
						
						case 4:
							System.out.println("Cual es el habitat del animal: ");
							scan = new Scanner(System.in);
							habitat = scan.nextLine();
							System.out.println("Los animales encontrados son:\n");
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String habitats = anim.getHabitat();
								if(habitats.equals(habitat)) {
									System.out.println(anim);
								}else {}
							}
							
						break;
						
						case 5: 
							System.out.println("Que tipo de comida come");
							scan = new Scanner(System.in);
							tipComida = scan.nextLine();
							System.out.println("Los animales encontrados son:\n");
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String tipComidas = anim.getTipComida();
								if(tipComidas.equals(tipComida)) {
									System.out.println(anim);
								}else {}
							}
							
						break;
							
						case 6:
							System.out.println("Saliendo del buscador");
						break;

						default:
						break;
						}
						
						} while (menuE != 6);	
					break;
					

					case 3:
						System.out.println("Saliendo");
					break;
					
					default:System.out.println("No existe la opcion");
						break;
					}
				} while (menuE !=3);
				break;

			case 5:
				do {
					System.out.println("Eliminacion de animales:\n 1:eliminar todo\n 2: eliminar animal por indice\n 3:eliminar por atributos\n 4:salir");
					scan = new Scanner(System.in);
					menuE = menuE = scan.nextInt();
					switch (menuE) {
					case 1:
						animales.clear();
						System.out.println("Los animales fueron eliminados\n"+animales);
					break;
					
					case 2:
						System.out.println("¿Cual es el indice del animal que quieres eliminar");
						scan = new Scanner(System.in);
						indice =scan.nextInt();
						anim = animales.get(indice);
						animales.remove(indice);
						System.out.println("El "+ anim.getTipAnimal() + "ha sido eliminado");
					break; 
					
					case 3:
						do {System.out.println("cual es el atributo que quiere utilizar\n 1:especie\n 2:tipo de animal\n 3: tamaño del aniimal\n 4:habitat del animal\n 5:tipo de comida\n 6: salir");
						scan = new Scanner(System.in);
						menuE = scan.nextInt();
						
						switch (menuE) {
						case 1:
							System.out.println("Cual es la especie");
							scan = new Scanner(System.in);
							especie = scan.nextLine();
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String especies = anim.getEspecie();
								if(especies.equals(especie)) {
									anim = animales.get(i);
									animales.remove(i);
									System.out.println("Se elimino\n"+anim);
								}else {}
								
							}
							break;
							
						case 2: 
							System.out.println("Cual es el animal que quieres eliminar");
							scan = new Scanner(System.in);
							tipAnimal = scan.nextLine();
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String especies = anim.getTipAnimal();
								if(especies.equals(tipAnimal)) {
									anim = animales.get(i);
									animales.remove(i);
									System.out.println("Se elimino\n"+anim);
								}else {}
							}
							
						break;
							
						case 3:
							System.out.println("Cual es el tamaño del animal que quieres eliminar ");
							scan = new Scanner(System.in);
							tamaño = scan.nextDouble();
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								double tamanos = anim.getTamaño();
								if(tamanos == tamaño) {
									anim = animales.get(i);
									animales.remove(i);
									System.out.println("Se elimino\n"+anim);
								}else {}
							}
							
						break;
						
						case 4:
							System.out.println("En que habitat esta el animal que quieres eliminar");
							scan = new Scanner(System.in);
							habitat = scan.nextLine();
							
							for (int i = 0; i < animales.size(); i++) {
								anim = animales.get(i);
								String habitats = anim.getHabitat();
								if(habitats.equals(habitat)) {
									anim = animales.get(i);
									animales.remove(i);
									System.out.println("Se elimino\n"+anim);
								}else {}
							}
							
						break;
						
						case 5: 
							System.out.println("Que tipo de comida come el animal que quieres eliminar");
							scan = new Scanner(System.in);
							tipComida = scan.nextLine();
							for (int y = 0; y < animales.size(); y++) {
								for (int i = 0; i < animales.size(); i++) {
									anim = animales.get(i);
									String tipComidas = anim.getTipComida();
									if(tipComidas.equals(tipComida)) {
										anim = animales.get(i);
										animales.remove(i);
										System.out.println("Se elimino\n"+anim);
									}else {}
								}
							}
							
						break;
							
						case 6:
							System.out.println("Saliendo del buscador");
						break;

						default:
						break;
						}
						
						} while (menuE != 6);	
					break;
					
						
					case 4:
						System.out.println("Saliendo del sistema");
					break;
					
					default:
						break;
					}
				} while (menuE != 4);
				
			break;
			
			case 6:
				System.out.println("El numero de animales que hay son: "+animales.size());
			break;
			
			case 7:
				if(animales.isEmpty()) {
					System.out.println("Lista vacia: "+animales);
				}else {
					System.out.println("La lista contiene "+animales.size()+" animales");}
			break;
			
			case 8:
				System.out.println("Saliendo del sistema..........");
			
			default:
				System.out.println("Saliendo");
				break;
			}
			
			
		} while (menuP != 8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
