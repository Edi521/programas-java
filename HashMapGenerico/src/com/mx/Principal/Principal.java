package com.mx.Principal;

import com.mx.Entidad.Fruta;
import com.mx.Entidad.Juguete;
import com.mx.Implementacion.ImpFruta;
import com.mx.Implementacion.ImpJuguete;

public class Principal {

	public static void main(String[] args) {
		
		Fruta fruta1 = new Fruta("Melon","Cafe",80,50,"Verano");
		Fruta fruta2 = new Fruta("Mango", "Amrillo", 38, 10, "Verano");
		Fruta fruta3 = new Fruta("Sandia", "verde", 60, 5, "primavera");
		Fruta fruta4 = new Fruta("Mandarina","naranja",25.50,5,"Otoño");
		Fruta fruta5 = new Fruta("Fresa","Roja",40,20,"Primavera");
		Fruta fruta6 = new Fruta("Cereza","Rojo",20,5,"Otoño");
		Fruta fruta7 = new Fruta("Guayaba", "Amarilo verde", 26, 11, "Verano");
		
		//Auxiliar
		Fruta auxF = null;
		
		ImpFruta impF = new ImpFruta();
		
		//Guardar
		impF.guardar(fruta1.getNombre(), fruta1);
		impF.guardar(fruta2.getNombre(), fruta2);
		impF.guardar(fruta3.getNombre(), fruta3);
		impF.guardar(fruta4.getNombre(), fruta4);
		impF.guardar(fruta5.getNombre(), fruta5);
		impF.guardar(fruta6.getNombre(), fruta6);
		impF.guardar(fruta7.getNombre(), fruta7);
		
		impF.mostrar();
		
		//Buscar
		auxF = (Fruta) impF.buscar("Cereza");
		System.out.println("Fruta encontrada: "+auxF);
		
		//Editar
		auxF = (Fruta) impF.buscar("Mango");
		
		auxF.setColor("Naranja");
		impF.editar(auxF.getNombre(), auxF);
		System.out.println("Frutas actualizadas\n");
		impF.mostrar();
		
		auxF = (Fruta) impF.buscar("Melon");
		impF.eliminar(auxF.getNombre());
		System.out.println("Fruta eliminada: "+auxF.getNombre()+"con exito.");
		impF.mostrar();
		
		
		//Instancia de un juguete
		Juguete j1 = new Juguete(1, "Max Steel", "6-12", 250, "Matel", "Accion");
		
		ImpJuguete impJ = new ImpJuguete();
		
		impJ.guardar(j1.getSku(), j1);
		impJ.mostrar();
		
		
	}
	
	
	
}
