package controlador;

import java.util.Iterator;

import modelo.Pelicula;
import modelo.TVBosque;
import persistencia.AdministracionIO;

public class Controlador {

	private TVBosque bosque;
	private AdministracionIO admi;
	
	public Controlador() {
		bosque = new TVBosque();
		admi = new AdministracionIO(this);
		
		try
		{
			admi.cargar();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void cargarPelicula(String titulo, String estudio, String version, String estado, int precio, String clasificacion, String anio, String genero, String fecha, String ID) {
		bosque.cargar(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
	}
	
	public void editar(String ID, Pelicula editada) {
		try {
			bosque.editar(ID, editada);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Iterator<Pelicula> buscarPeriodoDebut(String anio) {
		Iterator<Pelicula> it = null;
		
		try {
			it = bosque.buscarPeriodoDebut(anio);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return it;
	}
	
	public Iterator<Pelicula> darPeliculas() {
		return bosque.darPeliculas();
	}
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
	}
	
	public void guardar() {
		try {
			admi.guardar();
		} catch(Exception e) {
			
		}
	}
}
