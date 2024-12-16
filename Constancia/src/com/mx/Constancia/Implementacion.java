package com.mx.Constancia;

import java.util.HashMap;
import java.util.Scanner;

public class Implementacion implements IMetodos{
	
	HashMap<String,Constancia> hash = new HashMap<String, Constancia>();

	@Override
	public void guardar(Constancia constancia) {
		// TODO Auto-generated method stub
		hash.put(constancia.getNombre(), constancia);
		
	}

	@Override
	public Constancia buscar(Constancia constancia) {
		// TODO Auto-generated method stub
		return hash.get(constancia.getNombre());
	}

	@Override
	public void editar(Constancia constancia) {
		// TODO Auto-generated method stub
		hash.put(constancia.getNombre(),constancia);
		
	}

	@Override
	public void eliminar(Constancia constancia) {
		// TODO Auto-generated method stub
		hash.remove(constancia.getNombre());
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		if(!hash.isEmpty()) {
			System.out.println("Estas son las constancias");
			for (Constancia co : hash.values()) {
				System.out.println("Key: "+co.getNombre()+", Nombre del curso: "+co.getNomCurso()+", Realizado en: "+co.getFecha()+", Duracion: "+co.getDuracion());
			}
			//System.out.println("Estas son las constancias almacenadas\n"+hash);
		}else {
			System.out.println("No hay constancias" + hash);
		}

		
	}
	
	public void contar() {
		if(!hash.isEmpty()) {
			System.out.println("Se cuenta con: "+hash.size()+" constancia(s)");
		}else {
			System.out.println("No hay constancias" + hash);
		}

	}
	
	public void eliminarTodo() {
		if(!hash.isEmpty()) {
			hash.clear();
			System.out.println("Estas son las constancias almacenadas\n"+hash);
		}else {
			System.out.println("No hay constancias" + hash);
		}

	}
	
	public boolean verificarKey(String key) {
		boolean bandera = false;
			
		for(Constancia co : hash.values()) {
			if(co.getNombre().equals(key)) {
				System.out.println("Si existe la key");
				bandera = true;
				break;
			}
		}
		
		if(bandera == false) {
			System.out.println("La key ingresada no es valida");
		}
		
		return bandera;
	}
	
	
	public boolean verificarCurso(String nomCurso) {
		boolean bandera = false;
		
		for(Constancia co : hash.values()) {
			if(co.getNomCurso().equals(nomCurso)) {
				System.out.println("El curso si existe");
				bandera = true;
				break;
			}
		}
		
		if(bandera == false) {
			System.out.println("El curso ingresado no es valido");
		}	
		return bandera;
	}
	
	public Constancia verificarConstancia(String key,int duracion, String nomCurso, String fecha) {
		
		Scanner datos = null;
		
		//Verificar nombre
				if(key.isBlank()) {
					while(key.isBlank()) {
					System.out.println("La constancia no tiene nombre, agregale uno");
					datos = new Scanner(System.in);
					key = datos.nextLine();
					}
				}
		
		//Verificar duracion
			if(duracion == 0) {
				while(duracion == 0) {
					System.out.println("La duracion del curso no es valido, corrigela");
					datos = new Scanner(System.in);
					duracion = datos.nextInt();
				}
			}
			
		//Verificar curso
			if(nomCurso.isBlank()) {
				while(nomCurso.isBlank()) {
				System.out.println("La constancia no tiene un curso, agregale uno");
				datos = new Scanner(System.in);
				nomCurso = datos.nextLine();
				}
			}
			
		//Verificar fecha
			if(fecha.isBlank()) {
				while(fecha.isBlank()) {
				System.out.println("La constancia no tiene el mes en que se impartio, agregale uno");
				datos = new Scanner(System.in);
				fecha = datos.nextLine();
				}
			}
			
			Constancia cons = new Constancia(key, duracion, nomCurso, fecha);
			return cons;
			
		
	}

}
