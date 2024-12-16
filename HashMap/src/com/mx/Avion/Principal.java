package com.mx.Avion;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		//Intanciar
		
		Avion avion1 = new Avion(1,"Bombardier","7500",80,"Comercial",2);
		Avion avion2 = new Avion(2, "Boeing", "737", 180, "Comercial", 2);
		Avion avion3 = new Avion(3, "Airbus", "A320", 200, "Comercial", 2);
		Avion avion4 = new Avion(4,"Antonov","An-225",6,"Transporte",6);
		Avion avion5 = new Avion(5, "Airbus", "340", 600, "Comercial", 3);
		Avion avion6 = new Avion(6,"Airbus","A320", 200,"Privado",3);
		Avion avion7 = new Avion(7, "Bombardier", "CRJ", 40, "Privado",2 );
		
		//Auxiliar
		Avion avion = null;
		
		//Instancia de la implementacion
		Implementacion imp = new Implementacion();
		
		
		//Guardar
		imp.guardar(avion1);
		imp.guardar(avion2);
		imp.guardar(avion3);
		imp.guardar(avion4);
		imp.guardar(avion5);
		imp.guardar(avion6);
		imp.guardar(avion7);
		
	/*	//mostrar
		imp.mostrar();
		
		//Buscar
		int clave = 4;
		avion = new Avion(clave);
		avion = imp.buscar(avion);
		System.out.println("Avion encontrado: "+avion);
		
		//Editar
		avion = new Avion(1);
		avion = imp.buscar(avion);
		avion.setPasajeros(200);
		avion.setNumTurbinas(4);
		imp.editar(avion);
		imp.mostrar();
		
		//Eliminar
		avion = new Avion(7);
		avion = imp.buscar(avion);
		imp.eliminar(avion);
		System.out.println("Elementos eliminados: \n"+avion+"\nHashMap actualizado");
		imp.mostrar();
		
		//Contar
		imp.contar();
		*/
		
		//Variables locales
		
		int clave;
		String fabricante;
		String modelo;
		int pasajeros;
		String tipo;
		int numTurbinas;
		
		int menuP = 0, menuE = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			mostrarMenu();
			switch (menuP) {
			case 1:
				System.out.println("***************** Alta **************");
				System.out.println("Llena los siguientes campos");
				clave = imp.contador()+1;
				System.out.println("Fabricante del avion:");
				scanner = new Scanner(System.in);
				fabricante = scanner.nextLine();
				
				System.out.println("Modelo del avion: ");
				scanner = new Scanner(System.in);
				modelo = scanner.nextLine();
				
				System.out.println("Cantidad de pasajeros");
				scanner = new Scanner(System.in);
				pasajeros = scanner.nextInt();
				
				System.out.println("Tipo de avion: ");
				scanner = new Scanner(System.in);
				tipo = scanner.nextLine();
				
				System.out.println("Numero de tubinas: ");
				scanner = new Scanner(System.in);
				numTurbinas = scanner.nextInt();
				
				avion = new Avion(clave, fabricante, modelo, pasajeros, tipo,numTurbinas);
				
				imp.guardar(avion);
				break;
				
			case 2:
				System.out.println("******************************* Editar *********************");
				imprimirDatosHash(imp);
				if(!imp.hash.isEmpty()) {
					scanner = new Scanner(System.in);
					System.out.println("Indica la clave a actualizar: ");
					clave = scanner.nextInt();
					if(imp.hash.containsKey(clave)) {
						avion = new Avion(clave);
						avion = imp.buscar(avion);
						System.out.println("El avion que quiere actualizar es el: "+avion.getModelo());
						do {
							System.out.println("*********** Menu editar *************");
							System.out.println("1: Tipo"+"\n2: Numero de turbinas"+"\n3Regresar");
							scanner = new Scanner(System.in);
							menuE = scanner.nextInt();
							switch (menuP) {
							case 1:
								System.out.println("Tipo: ");
								scanner = new Scanner(System.in);
								tipo = scanner.nextLine();
								avion.setTipo(tipo);
								break;
							case 2:
								System.out.println("Numero de turbinas: ");
								scanner = new Scanner(System.in);
								numTurbinas = scanner.nextInt();
								avion.setNumTurbinas(numTurbinas);
								break;
							case 3:
								System.out.println("Actualizado ...............");
								imp.editar(avion);
								System.out.println("ok.\nRegresando al Menu princial");
								break;

							default:
								System.out.println("Opcion invalida. Intenta nuevamente");
								break;
							}
						} while (menuE != 3);
					}else {
						System.out.println("No existe avion con la clave: "+clave);
					}
				}
				
				break;
				
			case 3:
				System.out.println("********* Buscar por modelo *****************");
				imprimirDatosHash(imp);
				System.out.println("Indica el modelo que quieres buscar: ");
				scanner = new Scanner(System.in);
				modelo = scanner.nextLine();
				
				avion = imp.buscarPorModelo(modelo);
				if(avion != null) {
					System.out.println("Avion encontrado: "+avion);
				}else {
					System.out.println("El avion de modelo "+modelo+"no existe");
				}
				break;
			
			case 4:
				if(imp.hash.isEmpty()) {
					System.out.println("No hay informacion disponible");
				}else {
					imp.mostrar();
				}
				break;
			case 5:
				System.out.println("Saliendo ......................");
				
			default:
				System.out.println("Error");
				break;
			}
			
			
			
			
		} while (menuP !=5);		
	}//Cierre de main
	
private static void mostrarMenu() {
		System.out.println("*********************** Menu ****************");
		System.out.println("1: Alta\n2: Editar\n3: Buscar\n4: Mostrar\n5: SALIR");
		System.out.println("Elige una opcion");
	}

public static void imprimirDatosHash(Implementacion imp) {
	/*System.out.println("1 forma");
	Iterator iterador = imp.hash.entrySet().iterator();
	while(iterador.hasNext()) {
		Entry entry = (Entry) iterador.next();
		System.out.println("Clave: "+entry.getKey());
		
	}*/
	
	/*System.out.println("2 forma");
	for (Avion av : imp.hash.values()) {
		System.out.println("Clave: "+av.getClave()+", modelo: "+av.getModelo());
	}*/
	
	/*System.out.println("Tercera forma");
	for(Entry entry:imp.hash.entrySet()) {
		System.out.println("Clave: "+entry.getKey());
	}*/
	
	/*System.out.println("4 forma");
	for(int key : imp.hash.keySet()) {
		System.out.println("Clave: "+key);
	}*/
	
	
}
	
	
	

}//cierre de clase
