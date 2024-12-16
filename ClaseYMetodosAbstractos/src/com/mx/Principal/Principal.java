package com.mx.Principal;

import com.mx.Entidad.Abogado;
import com.mx.Entidad.Medico;
import com.mx.Entidad.Profesionista;

public class Principal {
	
	public static void main(String[] args) {
		
		//Instanciar un profesionista no se permite ya que es una clase abstracta
		
		Abogado abogado = new Abogado("Ricardo", "Torres", 28, 3355, "UNAM", 3, "Mercantil", "Torres y asociados",2500);
		
		abogado.cobrar(abogado.getTipo(),abogado.getHonorarios());
		
		abogado.trabajar();
		
		System.out.println(abogado);
		
		Medico medico = new Medico("Juan", "Valencia", 35, 34534, "ITP", 2, "Cirujano", "A233", 2800);
		
		medico.cobrar(medico.getEspecialidad(), medico.getCobroConsulta());
		
		medico.trabajar();
		
		System.out.println(medico);
	}

}
