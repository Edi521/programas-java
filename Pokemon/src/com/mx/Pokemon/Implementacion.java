package com.mx.Pokemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Implementacion implements IMetodos {
	
	
	//Crear lista
	
	List<Pokemon> pokemones = new ArrayList<Pokemon>();
	
	

	@Override
	public void crear(Pokemon pokemon) {
		
		pokemones.add(pokemon);
		System.out.println("Se añadio a: "+pokemon.getNombre()+" a tu pokedex\n");
		
	}

	@Override
	public void leer() {
		if(pokemones.isEmpty()) {
			System.out.println("No hay pokemones "+pokemones);
		}else {
		for(int i = 0; i<pokemones.size();i++) {
			System.out.println("Pokemon[ "+i+ " ], nombre: "+pokemones.get(i).getNombre()+" Tipo: "+pokemones.get(i).getTipo()+" Ps: "+pokemones.get(i).getPs()+" Nivel: "+pokemones.get(i).getNivel()+" Objeto: "+pokemones.get(i).gettObjeto());
		}
		//System.out.println("Estos son tus pokemones\n"+pokemones+"\n");
		}
		
	}

	@Override
	public void actualizar(int indice, Pokemon pokemon) {
		pokemones.set(indice, pokemon);
	}

	@Override
	public void eliminar(int indice) {

		pokemones.remove(indice);
		
	}

	@Override
	public Pokemon buscar(int indice) {
		// TODO Auto-generated method stub
		
		return pokemones.get(indice);
		
	}
	
	
	//Metodo personalizado
	public void pelear(Pokemon pokemon, Pokemon pokemon1) {
		
		if(pokemon.getPs() > pokemon1.getPs()) {
			System.out.println(pokemon.getNombre()+" a ganado");
		}else {
			if(pokemon.getPs() == pokemon1.getPs()) {
				System.out.println("Empate entre: "+pokemon.getNombre()+" y "+pokemon1.getNombre());
			}else {
				System.out.println(pokemon1.getNombre()+" a ganado");
			}
		}
		
	}
	
	
	public void verificarPokemon(Pokemon pokemon) {
		pokemon.getNombre();
		Scanner datos = new Scanner(System.in);
		String nombre, tipo;
		int ps;
		
		//Verificar nombre
		if(pokemon.getNombre().isBlank()) {
			while(pokemon.getNombre().isBlank()|| pokemon.getNombre().contains("@")|| pokemon.getNombre().contains("_")||pokemon.getNombre().contains(". ")) {
			System.out.println("El pokemon no tiene nombre, agregale uno");
			nombre = datos.nextLine();
			pokemon.setNombre(nombre);
			}
		}
		
		//Verificar tipo
		if(pokemon.getTipo().isBlank()) {
			while(pokemon.getTipo().isBlank()) {
			System.out.println("No escribiste el tipo de pokemon que es:"+pokemon.getNombre()+" , agregale uno");
			tipo = datos.nextLine();
			pokemon.setTipo(tipo);
			}
		}	
		
	}
		
	public  boolean buscarNombre(String nombre) {
		boolean respuesta = false;
		for (int i = 0; i < pokemones.size(); i++) {
			if(pokemones.get(i).getNombre().equals(nombre)) {
				System.out.println(nombre + " Existe");
				respuesta = true;
			}
		}
		if(respuesta == true) {
			
		}else {
			System.out.println(nombre + " No existe");
			respuesta = false;
		}
		
		return respuesta;
		
	}
	
	public int regresarIndice(int indice) {
		Scanner datos = null;
		do {
			if(indice >= pokemones.size()) {
				System.out.println("Ingresa un indice valido");
				datos = new Scanner(System.in);
				indice = datos.nextInt();
			}
			//break;
		} while (indice >= pokemones.size());
		return indice;
	}

	public boolean buscarTipo(String tipo) {
		boolean bandera = false;
		for (int i = 0; i < pokemones.size(); i++) {
			if(pokemones.get(i).getTipo().equals(tipo)) {
				System.out.println("El tipo de pokemon existe");
				System.out.println("Los pokemones encontrados son: "+pokemones.get(i));
				bandera = true;
			}
		}
		if(bandera == false) {
			System.out.println("El tipo de pokemon no esta");
		}
		
		return bandera;
		
	}

	
	public void mostrarIndice() {
		for (int i = 0; i < pokemones.size(); i++) {
			System.out.println("["+i+"]"+pokemones.get(i).getNombre());
		}
	}
	
	public void eliminarTipo(String tipo) {
		for (int i = 0; i < pokemones.size(); i++) {
			if(pokemones.get(i).getTipo().equals(tipo)) {
				pokemones.remove(i);
			}
		}
		
		System.out.println("Esta es tu nueva pokedex:\n"+pokemones);
	}
	
	
	

}
