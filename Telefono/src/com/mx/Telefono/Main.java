package com.mx.Telefono;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Telefono tel1 = new Telefono("Samsung",12,"Azul",128,"snapdragon 680");
		Telefono tel2 = new Telefono("Apple", 13, "Negro", 128,"Apple Chip A16");
		
		Telefono tel3 = new Telefono("Motorola", 12, "Verde", 128, "snapdragon 680");
		Telefono tel4 = new Telefono("Huawei", 15, "Oro", 128, "snapdragon 680");
		Telefono tel5 = new Telefono("Xiaomi", 10, "Negro", 256, "snapdragon 680");
		Telefono tel6 = new Telefono("Huawei-Honor", 16, "Rojo", 256, "snapdragon 680");
		Telefono tel7 = new Telefono("Motorola", 15, "Verde", 256, "snapdragon 680");
		
	
		//System.out.println("\n\nTelefono \nMarca: "+tel2.getMarca() + "\nTamaño de pantalla: "+tel2.getTamPantalla()+" ''"+ "\nColor: "+tel2.getColor()+"\nAlamacenamiento: "+tel2.getTamAlmacenamiento()+"GB"+ "\nProcesador: "+tel2.getTipProcesador());
		
		Telefono tel = null;
		List<Telefono> telefonos= new ArrayList<Telefono>();
		
		telefonos.add(tel1);
		telefonos.add(tel2);
		telefonos.add(tel3);
		telefonos.add(tel4);
		telefonos.add(tel5);
		telefonos.add(tel6);
		telefonos.add(tel7);
		
		System.out.println("La lista telefono contiene: \n"+telefonos);
		
		int buscar = 2;
		tel = telefonos.get(buscar);
		System.out.println("\nEl telefono encontrado en el indice: "+buscar+" es:\n"+tel);
		
		int editar = 1;
		tel = telefonos.get(editar);
		tel.setColor("Amarillo");
		tel.setTamAlmacenamiento(256);
		System.out.println("El nuevo telefono ingresado tiene estas caracteristicas:\n" + tel);
		
		int borrar = 0;
		tel = telefonos.get(borrar);
		telefonos.remove(borrar);
		
		System.out.println("El telfono que removio fue:\n"+tel);
		
		
		boolean opcion = false;
		if(opcion == true) {
			telefonos.clear();
			if(telefonos.isEmpty()) {
				System.out.println("Tu lista se encuentra vacia: "+telefonos);
			}else {
				System.out.println("Tu lista contiene: \n"+telefonos);
			}
		}else {
			System.out.println("Tu lista contiene: \n"+telefonos);
		}
		
	}

}
