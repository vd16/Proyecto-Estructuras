package modelo;

import java.io.Serializable;

import iterativo.ListaSimple;

public class TVBosque implements Serializable{

	private ListaSimple<Pelicula> lista;
	
	public TVBosque()
	{
		lista = new ListaSimple<Pelicula>();
	}
	
	public void cargar(String titulo, String estudio, String version, String estado, int precio, String clasificacion, String anio, String genero, String fecha, String ID) {
		Pelicula nueva = new Pelicula(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
		
		lista.agregar(nueva);
	}
	
}
