package com.mx.Principal;

public interface IMetodos {
	
	public void guardar(Object key,Object value);
	public void editar(Object key, Object value);
	public void eliminar(Object key);
	public Object buscar(Object key);
	public void mostrar();

}
