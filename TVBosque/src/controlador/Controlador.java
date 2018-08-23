package controlador;

import java.util.Iterator;

import iterativo.ListaSimple;
import modelo.Pelicula;
import modelo.TVBosque;
import persistencia.AdministracionIO;

public class Controlador {

	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

	/*
	 * Tienda de pel�culas
	 */
	private TVBosque bosque;
	
	/*
	 * Administrador I/O
	 */
	private AdministracionIO admi;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

	/*
	 * Crea un nuevo controlador.
	 * <b>post: </b>Crea las instancias de las clases TVBosque y AdministradorIO y carga todas las pel�culas al sistema
	 */
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
	
	// -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
	
	/*
	 * Carga todas las pel�culas del archivo en la lista enlazada. <br>
	 * <b>post: </b>Se guardan todas las pel�culas con sus datos.
	 * @param titulo T�tulo de la pel�cula. titulo != null && titulo != "".
	 * @param estudio Estudio de la pel�cula. estudio != null && estudio != "".
	 * @param version Versi�n de la pel�cula. version != null && version != "".
	 * @param estado Estado de la pel�cula. estado != null && estado != "".
	 * @param precio Precio de la pel�cula. precio >= 0.
	 * @param clasificacion Clasificaci�n de la pel�cula. clasificacion != null && clasificacion != "".
	 * @param anio A�o de la pel�cula. anio != null && anio != "".
	 * @param genero G�nero de la pel�cula. genero != null && genero != "".
	 * @param fecha Fecha de la pel�cula. fecha != null && genero != "".
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 */
	public void cargarPelicula(String titulo, String estudio, String version, String estado, int precio, String clasificacion, String anio, String genero, String fecha, String ID) {
		bosque.cargar(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
	}
	
	/*
	 * Edita una pel�cula seg�n petici�n del usuario. <br>
	 * <b>post: </b>Se le asignan nuevos datos a la pel�cula deseada.
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 * @param editada Pel�cula editada por el usuario. editada != null.
	 */
	public void editar(String ID, Pelicula editada) {
		try {
			bosque.editar(ID, editada);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Busca pel�culas seg�n su per�odo anual de debut y las agrega a una lista enlazada. <br>
	 * @param anio A�o de la pel�cula. anio != null && anio != "".
	 * @return Iterador de la lista con las pel�culas buscadas.
	 * @throws Exception si no se encuentran pel�culas.
	 */
	public ListaSimple<Pelicula> buscarPeriodoDebut(String anio) {
		ListaSimple<Pelicula> it = null;
		
		try {
			it = bosque.buscarPeriodoDebut(anio);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return it;
	}
	
	public ListaSimple<Pelicula> buscarPorGenero(String genero){
		return bosque.buscarPorGenero(genero);
	}
	
	public boolean agregar(String titulo, String estudio, String version, String estado, int precio, String clasificacion,
			String anio, String genero, String fecha, String ID) {
		return bosque.agregar(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
	}
	
	/*
	 * Retorna un iterador con las pel�culas de la tienda
	 * @return Iterador de las pel�culas
	 */
	public Iterator<Pelicula> darPeliculas() {
		return bosque.darPeliculas();
	}
	/**
	 * Muestra la lista de las pel�culas que cumplen una versi�n dada.
	 * @param version. version != null && version != "".
	 * @return Lista de las pel�culas que cumplen la versi�n dada.
	 */
	public ListaSimple<Pelicula> buscarPorVersiones(String version){
		return bosque.buscarPorVersion(version);
	}
	
	/**
	 * Muestra la lista de las pel�culas que cumplen una clasificaci�n espec�fica.
	 * @param Clasificaci�n. clasificacion != null && clasificacion != "".
	 * @return Lista de las pel�culas que cumplen la clasificaci�n dada.
	 */

	
	public ListaSimple<Pelicula> buscarPorClasificaciones(String clasificacion){
		return bosque.buscarPorClasificacion(clasificacion);
	}
	/*
	 * Guarda los cambios de las pel�culas en su mismo archivo
	 * @throws Exception si ocurre un error con el archivo
	 */
	public void guardar() {
		try {
			admi.guardar();
		} catch(Exception e) {
			
		}
	}
	
	/**
	 * Devuelve una lista con las pel�culas m�s costosas, que cumplen por lo menos con un g�nero dado.
	 * @param generos. generos != null.
	 * @return Lista con las pel�culas m�s costosas, que cumplen por lo menos con un g�nero dado.
	 */
	public ListaSimple<Pelicula> masCostosos(String[] generos) {
		return bosque.masCostosos(generos);
	}
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
	}
}
