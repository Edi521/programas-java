package com.mx.Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mx.Entidad.Serie;
import com.mx.Entidad.Videojuego;

public class Main {
	
	
	public static void main(String[] args) {
		
		Videojuego []videojuegos = new Videojuego[5];
		videojuegos[0] = new Videojuego("Call of duty: black ops 3", 9, "Disparos", "Activition");
		videojuegos[1] = new Videojuego("Pokemon: legens arceus", 30, "Fantacia", "Game Freak");
		videojuegos[2] = new Videojuego("Marvel´s Spider-man", 20, "Accion-Aventura", "Insomniac Games");
		videojuegos[3] = new Videojuego("Alien: Isolation", 20, "Terror", " The Creative Assembly");
		videojuegos[4] = new Videojuego("Hogwarts Legacy", 70, "Aventura", "Avalanche Software");
		
		Videojuego  vid = null;
		int mayor = 0, conteo = 0, menuG = 0, menuE = 0, indice = 0,conteo2 = 0;
		Scanner datos = null;
		String menSalida = "Saliendo.........";
	
		
		Serie []series = new Serie[5];
		series[0] = new Serie("Merlina", 1, "Terror", "Alfred Gough");
		series[1] = new Serie("Stranger Things", 4, "Terros", "Hermanos Duffer");
		series[2] = new Serie("La peor bruja", 4, "Fantasia", " Mark Russell");
		series[3] = new Serie("Arcane", 1, "Ciencia ficción fantástica", "Christian Linke");
		series[4] = new Serie("The Good Doctor", 7, "Drama", "David Shore");
		Serie ser = null;
		
		/*
		//Mostrar juegos
		System.out.println("Los juegos creados son:\n");
		for (Videojuego videojuego : videojuegos) {
			System.out.println(videojuego.toString());
		}
		
		//Mostrar juego con mayor horas
		System.out.println("El juego con mayor horas es: ");
		for (Videojuego videojuego : videojuegos) {
			if(mayor < videojuego.compareTo(videojuego)) {
				mayor = videojuego.compareTo(videojuego);
				vid = videojuego;
			}
		}
		System.out.println(vid);
		
		//Entregar
		videojuegos[3].entregar();
		System.out.println("Se entrego el videojuego:\n"+videojuegos[3]);
		
		//Contar entregas
		
		for (Videojuego videojuego : videojuegos) {
			if(videojuego.isEntregado() == true) {
				conteo = conteo +1;
			}
		}
		
		System.out.println("Los juegos entregados son: "+conteo);
		for (Videojuego videojuego : videojuegos) {
			if(videojuego.isEntregado() == true) {
				System.out.println(videojuego.toString());
			}
		}
		*/
		
		do {
			System.out.println("\n\n********* Menu de gestion *******");
			System.out.println("1: Videojuegos\n2: Series\n3: Salir");
			System.out.println("Ingrese el numero de la opcion que quiere");
			datos = new Scanner(System.in);
			try {
				menuG = datos.nextInt();
				switch (menuG) {
				
				case 1:
					do {
						System.out.println("\n\n********** Videojuegos ***********");
						System.out.println("1: mostrar vidojuegos guardados\n2: juego con mayor horas\n3: entregar juego\n4: devolver juego\n5: Contar entregas\n6: Salir");
						datos = new Scanner(System.in);
						try {
							menuE = datos.nextInt();
							switch (menuE) {
							case 1:
								System.out.println("Los juegos guardados son:\n");
								for (Videojuego videojuego : videojuegos) {
									System.out.println(videojuego.toString());
								}
								break;
							case 2:
								mayor = 0;
								System.out.println("El juego con mayor horas es: ");
								for (Videojuego videojuego : videojuegos) {
									if(mayor < videojuego.compareTo(videojuego)) {
										mayor = videojuego.compareTo(videojuego);
										vid = videojuego;
									}
								}
								System.out.println(vid);
								break;
								
							case 3:
								System.out.println("Ingrese el indice del juego que quieres enviar");
								int i = 0;
								for (Videojuego videojuego : videojuegos) {
									System.out.println("Indice: ["+i+"] "+videojuego.toString());
									i = i+1;
								}
								datos = new Scanner(System.in);
								try {
									indice = datos.nextInt();
									try {
										videojuegos[indice].entregar();
										System.out.println("Se entrego el videojuego:\n"+videojuegos[indice]);
									} catch (ArrayIndexOutOfBoundsException e) {
										System.out.println("El indice que ingresaste no existe");
									}
								} catch (InputMismatchException e) {
									System.out.println("Ingresa el dato correcto (indice del juego)");
								}		
								break;
							
							case 4:
								System.out.println("Ingresa el indice del juego para devolver");
								i = 0;
								for (Videojuego videojuego : videojuegos) {
									System.out.println("Indice: ["+i+"] "+videojuego.toString());
									i = i+1;
								}
								datos = new Scanner(System .in);
								try {
									indice = datos.nextInt();
									try {
										videojuegos[indice].devolver();
										System.out.println("Se devolvio el videojuego:\n"+videojuegos[indice]);
										conteo = conteo -1;
										if(conteo < 0) {
											conteo = 0;
										}
									} catch (ArrayIndexOutOfBoundsException e) {
										System.out.println("El indice que ingresaste no existe");
									}
								} catch (InputMismatchException e) {
									System.out.println("Ingresa el dato correcto (indice del juego)");
								}
								break;
							
							case 5:
								conteo = 0;
								for (Videojuego videojuego : videojuegos) {
									if(videojuego.isEntregado() == true) {
										conteo = conteo +1;
									}
								}
								
								System.out.println("Los juegos entregados son: "+conteo);
								for (Videojuego videojuego : videojuegos) {
									if(videojuego.isEntregado() == true) {
										System.out.println(videojuego.toString());
									}
								}
								break;
								
							case 6:
								System.out.println(menSalida);
								break;
							default:
								System.out.println("Error, ingresa una opcion valida");
								
								break;
							}
						} catch (InputMismatchException e) {
							System.out.println("Ingresa el dato correcto (numero de la opcion)");
						}
					
						
					} while (menuE != 6);
					
					break;
					
				case 2:
					do {
						System.out.println("\n\n********** Series ***********");
						System.out.println("1: mostrar series guardadas\n2: seri con mayor temporados\n3: entregar serie\n4: devolver serie\n5: Contar entregas\n6: Salir");
						datos = new Scanner(System.in);
						try {
							menuE = datos.nextInt();
							switch (menuE) {
							case 1:
								System.out.println("Las series guardadas son:\n");
								for (Serie serie : series) {
									System.out.println(serie.toString());
								}
								break;
								
							case 2:
								mayor = 0;
								System.out.println("La serie con mayor temporadas es: ");
								for (Serie serie : series) {
									if(mayor < serie.compareTo(serie)) {
										mayor = serie.compareTo(serie);
										ser = serie;
									}
								}
								System.out.println(ser);
								break;

							case 3:
								System.out.println("Ingrese el indice de la serie que quieres enviar");
								int i = 0;
								for (Serie serie : series) {
									System.out.println("Indice: ["+i+"] "+serie.toString());
									i = i+1;
								}
								datos = new Scanner(System.in);
								try {
									indice = datos.nextInt();
									try {
										series[indice].entregar();
										System.out.println("Se entrego el videojuego:\n"+series[indice]);
									} catch (ArrayIndexOutOfBoundsException e) {
										System.out.println("El indice que ingresaste no existe");
									}
								} catch (InputMismatchException e) {
									System.out.println("Ingresa el dato correcto (indice del juego)");
								}		
								break;
								
							case 4:
								System.out.println("Ingresa el indice de la serie para devolver");
								i = 0;
								for (Serie serie : series) {
									System.out.println("Indice: ["+i+"] "+serie.toString());
									i = i+1;
								}
								datos = new Scanner(System .in);
								try {
									indice = datos.nextInt();
									try {
										series[indice].devolver();
										System.out.println("Se devolvio el videojuego:\n"+series[indice]);
										conteo2 = conteo2 -1;
										if(conteo2 < 0) {
											conteo2 = 0;
										}
									} catch (ArrayIndexOutOfBoundsException e) {
										System.out.println("El indice que ingresaste no existe");
									}
								} catch (InputMismatchException e) {
									System.out.println("Ingresa el dato correcto (indice del juego)");
								}
								break;
							case 5:
								conteo2 = 0;
								for (Serie serie : series) {
									if(serie.isEntregado() == true) {
										conteo2 = conteo2 +1;
									}
								}
								
								System.out.println("Las series entregadas son: "+conteo2);
								for (Serie serie : series) {
									if(serie.isEntregado() == true) {
										System.out.println(serie.toString());
									}
								}
								break;
							case 6:
								System.out.println(menSalida);
								break;
							default:
								System.out.println("Error, ingresa una opcion valida");
								break;
							}
						} catch (InputMismatchException e) {
							System.out.println("Ingresa el dato correcto (numero de la opcion)");
						}
						
					} while (menuE != 6);
					break;
				
				case 3:
					System.out.println(menSalida);
					break;

				default:
					System.out.println("Error, ingresa una opcion valida");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingresa el dato correcto (numero de la opcion)");
			}
			
		} while (menuG != 3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//Main
	
}
