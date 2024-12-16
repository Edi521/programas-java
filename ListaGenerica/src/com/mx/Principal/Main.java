package com.mx.Principal;

import java.util.Scanner;

import com.mx.Entidad.Herramienta;
import com.mx.Entidad.Ropa;
import com.mx.Entidad.Verdura;
import com.mx.Implementacion.ImpHerramienta;
import com.mx.Implementacion.ImpRopa;
import com.mx.Implementacion.ImpVerdura;

public class Main {
	
	//EJERCICIO: REALIZAR UN PROGRAMA EN JAVA QUE UTILICE HERENCIA JERARQUICA COMO EN LA ANTERIOR PRACTICA UTILIZANDO LISTAS EN LUGAR DE HASMAP Y CON LAS SIGUIENTES CLASES:
	//ROPA, HERRAMIENTAS Y VERDURAS.ASI MISMO EN LA CLASE PRINCIPAL CREAR AL MENOS 5 OBJECTOS DE CADA CLASE E IMPLEMENTAR EL CRUD.
	
	
	public static void main(String[] args) {
		
		Ropa rop1 = new Ropa(150,"Playera","Rojo","Mediana","Algodon");
		Ropa rop2 = new Ropa(250, "Camisa", "Blanco", "Grande", "Algodon");
		Ropa rop3 = new Ropa(180, "Bufanda", "Cafe", "Unitalla", "Seda");
		Ropa rop4 = new Ropa(500, "Sueter", "Azul", "Chica", "Algodon");
		Ropa rop5 = new Ropa(1500, "Chamarra", "Cafe", "Grande", "Piel");
		
		Ropa rop = null;
		
		ImpRopa impR = new ImpRopa();
		
		//Guardar
		impR.guardar(rop1);
		impR.guardar(rop2);
		impR.guardar(rop3);
		impR.guardar(rop4);
		impR.guardar(rop5);
		
	/*	//Leer
		impR.mostrar();
		
		//Buscar
		int indice = 2;
		rop = (Ropa) impR.buscar(2);
		System.out.println("\n"+rop);
		
		//Editar
		indice = 4;
		rop = (Ropa) impR.buscar(indice);
		rop.setColor("Negro");
		impR.editar(indice, rop);
		System.out.println("\n"+rop);

		//Eliminar
		indice = 0;
		impR.eliminar(indice);
		impR.mostrar();
		
		//Buscar
		indice = 0;
		rop = (Ropa) impR.buscar(indice);
		System.out.println("\nSe encontro"+rop); */
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		Herramienta her1 = new Herramienta(200, "Martillo", "makita", 50, "Madera y metal");
		Herramienta her2 = new Herramienta(200, "Cerrucho", "makita", 20, "Madera y metal");
		Herramienta her3 = new Herramienta(1000, "Taladro", "makita", 80, "Plastico");
		Herramienta her4 = new Herramienta(80, "Desarmador", "makita", 10, "Plastico");
		Herramienta her5 = new Herramienta(60, "Pinzas", "makita", 50, "Metal");
		
		Herramienta her = null;
		
		ImpHerramienta impH = new ImpHerramienta();
		
		//Guardar
		impH.guardar(her1);
		impH.guardar(her2);
		impH.guardar(her3);
		impH.guardar(her4);
		impH.guardar(her5);
		
	/*	//Leer
		impH.mostrar();
		
		//Buscar
		indice = 2;
		her = (Herramienta) impH.buscar(2);
		System.out.println("\n"+her);
		
		//Editar
		indice = 4;
		her = (Herramienta) impH.buscar(indice);
		her.setPrecio(60);
		impH.editar(indice, her);
		System.out.println("\n"+her);

		//Eliminar
		indice = 0;
		impH.eliminar(indice);
		impH.mostrar();
		
		//Buscar
		indice = 0;
		her = (Herramienta) impH.buscar(indice);
		System.out.println("\nSe encontro"+her);  */
		/////////////////////////////////////////////////////////////////////////////////
		Verdura ver1 = new Verdura(10, "Tomate", "Rojo", 5, "Redondo");
		Verdura ver2 = new Verdura(15, "Zanaoria", "Naranja", 10, "Alargado");
		Verdura ver3 = new Verdura(10,"Papa","Amarillo",5,"Irregulas");
		Verdura ver4 = new Verdura(5,"Nopal","Verde",5,"Ovalado");
		Verdura ver5 = new Verdura(10,"Champiñon","Blanco",5,"Irregular");

		
		Verdura ver = null;
		
		ImpVerdura impV = new ImpVerdura();
		
		//Guardar
		impV.guardar(ver1);
		impV.guardar(ver2);
		impV.guardar(ver3);
		impV.guardar(ver4);
		impV.guardar(ver5);
		
	/*	//Leer
		impV.mostrar();
		
		//Buscar
		indice = 2;
		ver = (Verdura) impV.buscar(2);
		System.out.println("\n"+ver);
		
		//Editar
		indice = 4;
		ver = (Verdura) impV.buscar(indice);
		ver.setPrecio(60);
		impV.editar(indice, ver);
		System.out.println("\n"+ver);

		//Eliminar
		indice = 0;
		impV.eliminar(indice);
		impV.mostrar();
		
		//Buscar
		indice = 0;
		ver = (Verdura) impV.buscar(indice);
		System.out.println("\nSe encontro"+ver); */
		
		
		
		Scanner datos = null;
		int menuP = 0, menuE = 0, indice = 0, precio = 0,peso = 0;
		boolean bandera = false;
		String menSalida = "Saliendo ...........",tipo = null,color = null,talla = null,material = null,forma = null,marca = null;
		
		
		do {
			
			System.out.println("****************** Menu gestionar ***************");
			System.out.println("1. Ropa\n2. Herramienta\n3. Verdura\n4. Salir");
			datos = new Scanner(System.in);
			menuP = datos.nextInt();
			
			switch (menuP) {
			
			case 1:
				do {
					impR.menuOpciones("Ropa");
					datos = new Scanner(System.in);
					menuE = datos.nextInt();
					switch (menuE) {
					case 1:
						bandera = impR.verificarContenido();
						if(bandera == true) {
						impR.mostrar();
						System.out.println("Ingresa el indice de la prenda que quieres eliminar");
						datos = new Scanner(System.in);
						indice = datos.nextInt();
						bandera = impR.verificarIndice(indice);
						if(bandera == true) {
							impR.eliminar(indice);
							impR.mostrar();
						}else {
							while(bandera == false) {
								System.out.println("Ingresa un indice valido");
								datos = new Scanner(System.in);
								indice = datos.nextInt();
								bandera = impR.verificarIndice(indice);
							}
							impR.eliminar(indice);
							impR.mostrar();
						}
						}else {
							System.out.println("El inventario esta vacio");
						}
						break;
						
					case 2:
						System.out.println("Ingresa los siguientes datos");
						System.out.println("Precios de la prenda");
						datos = new Scanner(System.in);
						precio = datos.nextInt();
						precio = impR.verificarEntero(precio);
						
						System.out.println("Tipo de prenda");
						datos = new Scanner(System.in);
						tipo = datos.nextLine();
						tipo = impR.verificarCadena(tipo);
						//System.out.println(tipo);
						
						System.out.println("Color de la prenda");
						datos = new Scanner(System.in);
						color = datos.nextLine();
						color = impR.verificarCadena(color);
						
						System.out.println("Talla de la prenda");
						datos = new Scanner(System.in);
						talla = datos.nextLine();
						talla = impR.verificarCadena(talla);
						
						System.out.println("De que material esta hecho");
						datos = new Scanner(System.in);
						material = datos.nextLine();
						material = impR.verificarCadena(material);
						
						rop = new Ropa(precio, tipo, color, talla, material);
						impR.guardar(rop);
						impR.mostrar();
						
						
						break;
					case 3:
						System.out.println(menSalida);
						break;

					default:
						System.out.println("Error");
						break;
					}
					
					
					
				} while (menuE != 3);
				break;
				
				
			case 2:
				do {
					
					impH.menuOpciones("Herramienta");;
					datos = new Scanner(System.in);
					menuE = datos.nextInt();
					switch (menuE) {
					case 1:
						bandera = impH.verificarContenido();
						if(bandera == true) {
							impH.mostrar();
							System.out.println("Ingresa el indice de la herramienta que quieres eliminar");
							datos = new Scanner(System.in);
							indice = datos.nextInt();
							bandera = impH.verificarIndice(indice);
							if(bandera == true) {
								impH.eliminar(indice);
								impH.mostrar();
							}else {
								while(bandera == false) {
									System.out.println("Ingresa un indice valido");
									datos = new Scanner(System.in);
									indice = datos.nextInt();
									bandera = impH.verificarIndice(indice);
								}
								impH.eliminar(indice);
								impH.mostrar();
								
							}
							
						}else {
							System.out.println("El inventario esta vacio");
						}
						
						
						break;
						
					case 2:
						
						System.out.println("Ingresa los siguientes datos");
						System.out.println("Precios de la herramienta");
						datos = new Scanner(System.in);
						precio = datos.nextInt();
						precio = impH.verificarEntero(precio);
						
						System.out.println("Tipo de herramienta");
						datos = new Scanner(System.in);
						tipo = datos.nextLine();
						tipo = impH.verificarCadena(tipo);
						
						System.out.println("Marca de la herramienta");
						datos = new Scanner(System.in);
						marca = datos.nextLine();
						marca = impH.verificarCadena(marca);
						
						System.out.println("Peso de la herramienta");
						datos = new Scanner(System.in);
						peso = datos.nextInt();
						peso= impH.verificarEntero(peso);
						
						System.out.println("Material de la herramienta");
						datos = new Scanner(System.in);
						material = datos.nextLine();
						material= impV.verificarCadena(material);
						
						her = new Herramienta(precio, tipo, marca, peso, material);
						impH.guardar(her);
						impH.mostrar();
						break;

					case 3:
						System.out.println(menSalida);
						break;
						
					default:
						System.out.println("Error");
						break;
					}
					
					
					
				} while (menuE != 3);
				break;
			
			case 3:
				
				do {
					
					impV.menuOpciones("Verudra");
					datos = new Scanner(System.in);
					menuE = datos.nextInt();
					switch (menuE) {
					case 1:
						bandera = impV.verificarContenido();
						if(bandera == true) {
							impV.mostrar();
							System.out.println("Ingresa el indice de la verdura que quieres eliminar");
							datos = new Scanner(System.in);
							indice = datos.nextInt();
							bandera = impV.verificarIndice(indice);
							if(bandera == true) {
								impV.eliminar(indice);
								impV.mostrar();
							}else {
								while(bandera == false) {
									System.out.println("Ingresa un indice valido");
									datos = new Scanner(System.in);
									indice = datos.nextInt();
									bandera = impV.verificarIndice(indice);
								}
								impV.eliminar(indice);
								impV.mostrar();
								
							}
							
						}else {
							System.out.println("El inventario esta vacio");
						}
						break;
						
					case 2:
						
						System.out.println("Ingresa los siguientes datos");
						System.out.println("Precios de la verdura");
						datos = new Scanner(System.in);
						precio = datos.nextInt();
						precio = impV.verificarEntero(precio);
						
						System.out.println("Tipo de verdura");
						datos = new Scanner(System.in);
						tipo = datos.nextLine();
						tipo = impV.verificarCadena(tipo);
						
						System.out.println("Color de la verdura");
						datos = new Scanner(System.in);
						color = datos.nextLine();
						color = impV.verificarCadena(color);
						
						System.out.println("Peso de la verdura");
						datos = new Scanner(System.in);
						peso = datos.nextInt();
						peso= impV.verificarEntero(peso);
						
						System.out.println("Forma de la verdura");
						datos = new Scanner(System.in);
						forma = datos.nextLine();
						forma= impV.verificarCadena(forma);
						
						ver = new Verdura(precio, tipo, color, peso, forma);
						impV.guardar(ver);
						impV.mostrar();
						
						break;
						
					case 3:
						System.out.println(menSalida);
						break;

					default:
						System.out.println("Error");
						break;
					}
					
					
				} while (menuE != 3);
				
				break;
				
			
			case 4:
				System.out.println(menSalida);
				break;

			default:
				System.out.println("Error");
				break;
			}
			
			
			
			
			
			
		} while (menuP != 4);
		
		
		
		
		
		
		
	}//Main
	

}
