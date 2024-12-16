package com.mx.Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Funcion {

	public void leer(String url) throws FileNotFoundException, IOException{
		
		String linea;
		
		File archivo = new File(url);
		
		FileReader fr = new FileReader(archivo);
		
		BufferedReader br = new BufferedReader(fr);
		
		while((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
	}
	
	public void dividir(int a, int b) {
		System.out.println("La division: \n"+a+"\n"+b+" = "+a/b);
	}
	
	
	
	
	
}
