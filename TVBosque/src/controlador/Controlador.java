package controlador;

import modelo.TVBosque;
import persistencia.AdministracionIO;

public class Controlador {

	private TVBosque bosque;
	private AdministracionIO admi;
	
	public Controlador() {
		bosque = new TVBosque();
		admi = new AdministracionIO(bosque);
		
		try
		{
			admi.cargar();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void agregarPelicula(String titulo, String estudio, String version, String estado, int precio, String clasificacion, String anio, String genero, String fecha, String ID) {
		try {
			bosque.cargar(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
	}
}
