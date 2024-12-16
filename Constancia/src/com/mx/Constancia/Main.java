package com.mx.Constancia;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		//EJERCICIO: CON EL EJERCICIO ANTERIOR DE HASHMAP REALIZAR EL SIGUIENTE MENU:
		/*
		 * ALTA (AGREAGAR UNA VALIDACION)
		 * EDITAR //SUBMENU 
		 * BUSCAR X INDICE
		 * BUSCAR X OTRO ATRIBUTO
		 * ELIMINAR X INDICE
		 * ELIMINAR X OTRO ATRIBUTO
		 * MOSTRAR
		 * CONTAR
		 * ELIMINAR TODO
		 * SALIR
		 * 
		 * SE DEBE AGREGAR VALIDACIONES COMO EN LA PRACTICA ANTERIO Y TODA LA FUNCIONALIDAD DEBE IR EN LA IMPLEMENTACION.
		 * */
		
		Constancia constancia1 = new Constancia("Carlos", 20, "Videojuegos", "Marzo");
		Constancia constancia2 = new Constancia("Eduardo", 50, "Modelado 3D", "Julio");
		Constancia constancia3 = new Constancia("Julio", 150, "Modelado 3D", "Abril");
		
		//Variables
		int menuP = 0, munuE = 0,duracion = 0;
		String mensajeSalida = "Saliendo..........",key,nomCurso,mes;
		Scanner datos = null;
		boolean bandera = false;
		
		//Auxiliar
		Constancia cons = null;
		
		//Instancia de la implementacion
		Implementacion imp = new Implementacion();
		
		//Guardar
		
		imp.guardar(constancia1);
		imp.guardar(constancia2);
		imp.guardar(constancia3);
		
		
	/*	//Mostrar
		imp.mostrar();
		
		//Buscar
		cons = new Constancia("Eduardo");
		cons = imp.buscar(cons);
		System.out.println("Alumno encontrado "+cons);
		
		//Editar 
		cons = new Constancia("Eduardo");
		cons = imp.buscar(cons);
		cons.setDuracion(4);
		imp.editar(cons);
		imp.mostrar();
		
		//Eliminar
		cons = new Constancia("Julio");
		cons = imp.buscar(cons);
		imp.eliminar(cons);
		System.out.println("Se elimino: \n"+cons+"\nHashMap actualizado");
		imp.mostrar();
	*/
		
		
		do {
			System.out.println("****************** Menu principal ****************");
			System.out.println("1: Alta\n2: Editar\n3: Buscar\n4: Eliminar\n5: Mostrar\n6: Contar\n7: Salir");
			datos = new Scanner(System.in);
			menuP = datos.nextInt();
			
			switch (menuP) {
			
			case 1:
				System.out.println("***************** Alta **************");
				System.out.println("Llena los siguientes campos");
				
				System.out.println("Nombre del alumno");
				datos = new Scanner(System.in);
				key = datos.nextLine();
				
				System.out.println("Nombre del curso");
				datos = new Scanner(System.in);
				nomCurso = datos.nextLine();
				
				System.out.println("Duracion del curso");
				datos = new Scanner(System.in);
				duracion = datos.nextInt();
				
				System.out.println("Mes en que se impartio");
				datos = new Scanner(System.in);
				mes = datos.nextLine();
				cons = imp.verificarConstancia(key, duracion, nomCurso, mes);
				imp.guardar(cons);
				
				break;
			
			case 2:
					if(!imp.hash.isEmpty()) {
						
						System.out.println("************** Editar **********");
						System.out.println("Cual es el alumno que quieres editar");
						datos = new Scanner(System.in);
						key = datos.nextLine();
						bandera = imp.verificarKey(key);
						if(bandera == true) {
							do {
							System.out.println("¿Que quieres editar?");
							System.out.println("1: Nombre del curso\n2: Duracion\n3: Mes en que se impartio\n4:Salir");
							datos = new Scanner(System.in);
							munuE = datos.nextInt();
							
							switch (munuE) {
							case 1:
								System.out.println("Ingresa el nombre del curso");
								datos = new Scanner(System.in);
								nomCurso = datos.nextLine();
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								cons.setNomCurso(nomCurso);
								imp.editar(cons);
								break;					
								
							case 2:
								System.out.println("Cual es la duracion del curso");
								datos = new Scanner(System.in);
								duracion = datos.nextInt();
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								cons.setDuracion(duracion);
								imp.editar(cons);
								break;
								
							case 3:
								System.out.println("En que mes se impartio el curso");
								datos = new Scanner(System.in);
								mes = datos.nextLine();
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								cons.setFecha(mes);
								imp.editar(cons);
								
								break;
								
							case 4:
								System.out.println(mensajeSalida);
								break;
							default:
								System.out.println("Error");
								break;
							}
							} while (munuE != 4);
						}else {
							System.out.println("El alumno no existe");
							System.out.println(mensajeSalida);
							break;
						}
						
					}else {
						System.out.println("No hay constancias");
						break;
					}

				break;
				
			
			case 3:
				do {
					if(!imp.hash.isEmpty()) {
						System.out.println("***************** Menu de busqueda ******************");
						System.out.println("1: Buscar por key\n2: Buscar por nombre del curso\n3: Salir");
						datos = new Scanner(System.in);
						munuE = datos.nextInt();
						
						switch (munuE) {
						case 1:
							System.out.println("Ingresa la key que quieres buscar");
							datos = new Scanner(System.in);
							key = datos.nextLine();
							bandera = imp.verificarKey(key);
							if(bandera == true) {
								System.out.println("Estas son las contancias encontradas");
								cons = new Constancia(key);
								System.out.println(imp.buscar(cons));
							}else {
								while(bandera == false) {
									System.out.println("Ingresa una key valida");
									datos = new Scanner(System.in);
									key = datos.nextLine();
									bandera = imp.verificarKey(key);
								}
								cons = new Constancia(key);
								System.out.println(imp.buscar(cons));
							}
							
							break;

						case 2:
							System.out.println("¿Cual es el curso que quieres buscar?");
							datos = new Scanner(System.in);
							nomCurso = datos.nextLine();
							bandera = imp.verificarCurso(nomCurso);
							if(bandera == true) {
								System.out.println("Estas son las constancias encontradas");
								for(Constancia co : imp.hash.values()) {
									if(co.getNomCurso().equals(nomCurso)) {
										System.out.println(co);
									}
								}
							}else {
								while(bandera == false) {
									System.out.println("Ingresa un curso valido");
									datos = new Scanner(System.in);
									nomCurso = datos.nextLine();
									bandera = imp.verificarCurso(nomCurso);
								}
								
								System.out.println("Estas son las constancias encontradas");
								for(Constancia co : imp.hash.values()) {
									if(co.getNomCurso().equals(nomCurso)) {
										System.out.println(co);
									}
								}
							}
							break;
							
						case 3:
							System.out.println(mensajeSalida);
							break;
						default:
							System.out.println("Error");
							break;
						}
						
						
					}else {
						System.out.println("No hay constancias");
						break;
					}
					
				} while (munuE != 3);
				break;
			
			case 4: 
				
				do {
					if(!imp.hash.isEmpty()) {
					System.out.println("************************* Menu de eliminacion **************");
					System.out.println("1: Eliminar todas las constancias\n2: Eliminar por key\n3: Eliminar por curso\n4: Salir");
					datos = new Scanner(System.in);
					munuE = datos.nextInt();
					switch (munuE) {
					case 1:
						imp.eliminarTodo();
						break;
						
					case 2:
						System.out.println("Estas son las constancias almacenadas");
						imp.mostrar();
						System.out.println("Ingresa la key que quieres eliminar");
						datos = new Scanner(System.in);
						key = datos.nextLine();
						bandera = imp.verificarKey(key);
						if(bandera == true) {
							cons = new Constancia(key);
							imp.eliminar(cons);
							imp.mostrar();
						}else {
							while(bandera == false) {
								System.out.println("Ingresa una key valida");
								datos = new Scanner(System.in);
								key = datos.nextLine();
								bandera = imp.verificarKey(key);
							}
							cons = new Constancia(key);
							imp.eliminar(cons);
							imp.mostrar();
						}
						
						break;
						
					case 3:
						imp.mostrar();
						System.out.println("Ingresa el curso de la(s) constancia(S) que quieres eliminar");
						datos = new Scanner(System.in);
						nomCurso = datos.nextLine();
						bandera = imp.verificarCurso(nomCurso);
						if(bandera == true) {
							System.out.println("Estas son las constancias con el curso que ingresaste\n");
							for(Constancia co : imp.hash.values()) {
								if(co.getNomCurso().equals(nomCurso)) {
									System.out.println(co);
								}
							}
							
							System.out.println("¿De quien es la constancia que quieres eliminar?");
							datos = new Scanner(System.in);
							key = datos.nextLine();
							bandera = imp.verificarKey(key);
							if(bandera == true) {
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								imp.eliminar(cons);
								System.out.println("Se elimino: \n"+cons);
								imp.mostrar();
							}else {
								while(bandera == false) {
									System.out.println("Ingresa una key valida");
									datos = new Scanner(System.in);
									key = datos.nextLine();
									bandera = imp.verificarKey(key);
								}
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								imp.eliminar(cons);
								System.out.println("Se elimino: \n"+cons);
								imp.mostrar();;
							}
							
						}else {
							while(bandera == false) {
								System.out.println(bandera);
								System.out.println("Ingresa un curso valido valida");
								datos = new Scanner(System.in);
								nomCurso = datos.nextLine();
								bandera = imp.verificarCurso(nomCurso);
							}
							System.out.println("¿De quien es la constancia que quieres eliminar?");
							datos = new Scanner(System.in);
							key = datos.nextLine();
							bandera = imp.verificarKey(key);
							if(bandera == true) {
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								imp.eliminar(cons);
								System.out.println("Se elimino: \n"+cons);
								imp.mostrar();
							}else {
								while(bandera == false) {
									System.out.println("Ingresa una key valida");
									datos = new Scanner(System.in);
									key = datos.nextLine();
									bandera = imp.verificarKey(key);
								}
								cons = new Constancia(key);
								cons = imp.buscar(cons);
								imp.eliminar(cons);
								System.out.println("Se elimino: \n"+cons);
								imp.mostrar();;
							}
							
							
						}	
						break;
						
					case 4:
						System.out.println(mensajeSalida);
					break;

					default:
						System.out.println("Error");
						break;
					}	
					}else {
						System.out.println("No hay constancias");
						break;
					}
					} while (munuE != 4);
				
				
				break; //caso 4
			
			case 5:
				imp.mostrar();
				break;
			
			case 6:
				imp.contar();
				break;
			
			case 7:
				System.out.println(mensajeSalida);
				break;

			default:
				System.out.println("Error");
				break;
			}
			
			
			
			
			
			
		} while (menuP != 7);
		

		
		
		
	}//llave main
}//llave clase
