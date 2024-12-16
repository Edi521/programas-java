package com.mx.Avion;

import java.util.HashMap;

public class Implementacion  implements IMetodos{
	
	HashMap<Integer, Avion> hash = new HashMap<Integer, Avion>();

	@Override
	public void guardar(Avion avion) {
		// TODO Auto-generated method stub
		hash.put(avion.getClave(), avion);
	}

	@Override
	public Avion buscar(Avion avion) {
		// TODO Auto-generated method stub
		return hash.get(avion.getClave());
	}

	@Override
	public void editar(Avion avion) {
		// TODO Auto-generated method stub
		hash.remove(avion.getClave());
		
	}

	@Override
	public void eliminar(Avion avion) {
		// TODO Auto-generated method stub
		hash.remove(avion.getClave());
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
		
	}
	
	//metodos personalizados
	public void contar() {
		System.out.println("El hashmap contiene: "+hash.size()+"avion(es)");
	}
	
	public Avion buscarPorClave(int clave) {
		return hash.get(clave);
	}
	
	public int contador() {
		return hash.size();
	}
	
	public Avion buscarPorModelo(String modelo) {
		for(Avion av : hash.values()) {
			if(av.getModelo().equalsIgnoreCase(modelo)) {
				return av;
			}
		}
		return null;
	}
	
	
	
	
	
	

}
