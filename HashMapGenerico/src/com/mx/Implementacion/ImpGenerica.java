package com.mx.Implementacion;

import java.util.HashMap;

import com.mx.Principal.IMetodos;

public class ImpGenerica implements IMetodos{

	protected HashMap<Object,Object> hash = new HashMap<Object, Object>();
	
	
	@Override
	public void guardar(Object key, Object value) {
		// TODO Auto-generated method stub
		hash.put(key, value);
	}

	@Override
	public void editar(Object key, Object value) {
		// TODO Auto-generated method stub
		hash.replace(key, value);
	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		hash.remove(key);
	}

	@Override
	public Object buscar(Object key) {
		// TODO Auto-generated method stub
		return hash.get(key);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
		
	}

}
