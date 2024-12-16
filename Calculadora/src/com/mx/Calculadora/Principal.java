package com.mx.Calculadora;

import java.util.Scanner;

public class Principal {

	// Intanciar la clase calculadora
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora("CASIO", "134JI", false, "NEGRO", 180);
		Calculadora c2 = new Calculadora("CASIO", "fx-991EX", true, "Blanco", 290);
		Calculadora c3 = new Calculadora("PLUS", "FX82PLUS", true, "GRIS", 200);
		Calculadora c4 = new Calculadora("Texas Instruments", "TX-01", true, "NEGRO", 6000);
		Calculadora c5 = new Calculadora("HP", "Advanced", true, "Gris", 300);
		Calculadora c6 = new Calculadora("HP", "S10+", true, "Morada", 299);
		Calculadora c7 = new Calculadora("TEXAS", "TI3050", true, "BLANCA", 1000);

		Calculadora aux = null;

		// Instanciar la implemantacion
		Implementacion imp = new Implementacion();

		// Agregar los objetos a la lista
		imp.crear(c1);
		imp.crear(c2);
		imp.crear(c3);
		imp.crear(c4);
		imp.crear(c5);
		imp.crear(c6);
		imp.crear(c7);

	/*	// mostrar
		imp.leer();

		// buscar
		aux = imp.buscar(0);
		System.out.println("Elemento encontrado\n " + aux);

		// editar
		aux = imp.buscar(3);
		aux.setColor("Verde");
		aux.setPrecio(500);
		imp.actualizar(3, aux);
		imp.leer();

		// eliminar
		imp.eliminar(6);
		imp.leer();

		// metodo personalizado
		imp.contarRegistros();  */
		
		//Variables locales
		String marca;
		String modelo;
		boolean esCientifica;
		String color;
		double precio;

		Scanner datos = null;
		
		int menu = 0, menuE = 0, indice = 0;
		
		do {
			
			System.out.println("------------------ Menu de inicio -----------------");
			System.out.println("1. Alta"+
							   "\n 2: Editar"+
								"\n 3: Buscar"+
							   	"\n 4: Eliminar"+
								"\n 5: Mostrar"+
							   	"\n 6: Contar"+
								"\n 7: Salir"+
							   	"\n Elija una opcion");
			datos = new Scanner(System.in);
			menu = datos.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("-------------- Alta ----------------");
				System.out.println("Llene los siguientes campos");
				System.out.println("Marca: ");
				datos = new Scanner(System.in);
				marca = datos.nextLine();
				
				System.out.println("Modelo: ");
				datos = new Scanner(System.in);
				modelo = datos.nextLine();
				
				System.out.println("¿Es cientifica? (Escribe si o no)");
				datos = new Scanner(System.in);
				String respuesta = datos.nextLine();
				if(respuesta.equalsIgnoreCase("si")) {
					esCientifica = true;
				}else {
					esCientifica = false;
				}
				
				System.out.println("Color: ");
				datos = new Scanner(System.in);
				color = datos.nextLine();
				
				System.out.println("Precio: ");
				datos = new Scanner(System.in);
				precio = datos.nextDouble();
				
				aux = new Calculadora(marca,modelo,esCientifica,color,precio);
				imp.crear(aux);
				System.out.println("Se ha guardado correctamente la calculadora: "+aux.getMarca());
				break;
				
				
			case 2:
				System.out.println("--------------- Editar -----------------");
				imprimirCalculadora(imp);
				if(imp.calculadoras.size() > 0) {
					System.out.println("Indice el indice para acturalizar el elemento: ");
					datos = new Scanner(System.in);
					indice = datos.nextInt();
					if(indice >= 0 && indice < imp.calculadoras.size()) {
						aux = imp.buscar(indice);
						do {
							System.out.println("------- Menu de editar -------");
							System.out.println("1: Modelo" + "\n2: Color" + "\n3: Precio" + "\n4: Regresar"+"\nElija una opcion");
							datos = new Scanner(System.in);
							menuE = datos.nextInt();
							switch (menuE) {
							case 1:
								System.out.println("Modelo");
								datos = new Scanner(System.in);
								modelo = datos.nextLine();
								aux.setModelo(modelo);
								break;
								
							case 2:
								System.out.println("Color: ");
								datos = new Scanner(System.in);
								color = datos.nextLine();
								aux.setColor(color);
								break;
							case 3:
								System.out.println("Precio");
								datos = new Scanner(System.in);
								precio = datos.nextDouble();
								aux.setPrecio(precio);
								break;
							case 4:
								System.out.println("Actualizado ..........................");
								imp.actualizar(indice, aux);
								System.out.println("OK.\nRegresamos al menu principal");
								break;
							default:
								System.out.println("Opcion no valida. Intenta de nuevo");
								break;
							}
						} while (menuE != 4);
					}else {
						System.out.println("Escribe un indice dentro del Rango. Intenta de nuevo");
					}
				}
				break;
				
			case 3:
				System.out.println("--------------- Buscar -----------");
				imprimirCalculadora(imp);
				if(!imp.calculadoras.isEmpty()) {
					System.out.println("Indica el indice para buscar: ");
					datos = new Scanner(System.in);
					indice = datos.nextInt();
					
					if(indice >= 0 && indice < imp.calculadoras.size()) {
						aux = imp.buscar(indice);
						System.out.println("Calculadora localizada: "+aux);
					}else {
						System.out.println("Indice fuera de rango. Intenta nuevamente");
					}
					
				}
				break;
				
			case 4:
				System.out.println("---------------- Eliminar --------------");
				imprimirCalculadora(imp);
				if(!imp.calculadoras.isEmpty()) {
					System.out.println("Indica el indice de la calculadora para eliminar: ");
					datos = new Scanner(System.in);
					indice = datos.nextInt();
					if(indice >= 0 && indice < imp.calculadoras.size()) {
						aux = imp.buscar(indice);
						imp.eliminar(indice);
						System.out.println("Calculadoras eliminada" + aux.getMarca() + "modelo: "+aux.getModelo());
					}else {
						System.out.println("Indice no existente. Intenta nuevamente");
					}
				}
				break;
				
			case 5:
				System.out.println("---------------------- Mostrar ----------------");
				if(imp.calculadoras.isEmpty()) {
					System.out.println("La lista es vacia. Ningun dato existente."+imp.calculadoras);
				}else {
					imp.leer();
				}
				break;
			case 6:
				System.out.println("--------------- Contar --------------");
				imp.contarRegistros();
				break;
			case 7:
				System.out.println("\n Saliendo .....................\n Hasta luego");
				break;

			default:
				System.out.println("Opcion invalida. Intente nuevamente.");
				break;
			}	
		} while (menu != 7);
		
		
		
		
		
		
		
		
		
		
		
		
	}// llave main
	
	
public static void imprimirCalculadora(Implementacion imp) {
	
	System.out.println("Calcualadora disponible: ");
	if(imp.calculadoras.size() > 0) {
		for(int i = 0; i<imp.calculadoras.size();i++) {
			System.out.println("Calculadoras[ "+i+"], marca: "+imp.calculadoras.get(i).getMarca());
		}
	}else {
		System.out.println("0 Calculadoras disponibles.");
	}
	
}
	
	
	
	
	
	
}// llave clase
