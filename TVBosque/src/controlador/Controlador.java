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
	 * Tienda de películas
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
	 * <b>post: </b>Crea las instancias de las clases TVBosque y AdministradorIO y carga todas las películas al sistema
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
    // Métodos
    // -----------------------------------------------------------------
	
	/*
	 * Carga todas las películas del archivo en la lista enlazada. <br>
	 * <b>post: </b>Se guardan todas las películas con sus datos.
	 * @param titulo Título de la película. titulo != null && titulo != "".
	 * @param estudio Estudio de la película. estudio != null && estudio != "".
	 * @param version Versión de la película. version != null && version != "".
	 * @param estado Estado de la película. estado != null && estado != "".
	 * @param precio Precio de la película. precio >= 0.
	 * @param clasificacion Clasificación de la película. clasificacion != null && clasificacion != "".
	 * @param anio Año de la película. anio != null && anio != "".
	 * @param genero Género de la película. genero != null && genero != "".
	 * @param fecha Fecha de la película. fecha != null && genero != "".
	 * @param ID ID de la película. ID != null && ID != "".
	 */
	public void cargarPelicula(String titulo, String estudio, String version, String estado, int precio, String clasificacion, String anio, String genero, String fecha, String ID) {
		bosque.cargar(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
	}
	
	/*
	 * Edita una película según petición del usuario. <br>
	 * <b>post: </b>Se le asignan nuevos datos a la película deseada.
	 * @param ID ID de la película. ID != null && ID != "".
	 * @param editada Película editada por el usuario. editada != null.
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
	 * Busca películas según su período anual de debut y las agrega a una lista enlazada. <br>
	 * @param anio Año de la película. anio != null && anio != "".
	 * @return Iterador de la lista con las películas buscadas.
	 * @throws Exception si no se encuentran películas.
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
	
	/*
	 * Retorna la lista de las películas de un género específico
	 * @param genero. genero != null && genero != "".
	 * @return Lista de las películas de un género específico.
	 */
	public ListaSimple<Pelicula> buscarPorGenero(String genero){
		return bosque.buscarPorGenero(genero);
	}
	
	/*
	 * Agrega una película con los parámetros dados
	 * @param titulo. titulo != null && titulo != "".
	 * @param estudio. estudio != null && estudio != "".
	 * @param version. version != null && version != "".
	 * @param estado. estado != null && estado != "".
	 * @param precio. precio != 0.
	 * @param clasificacion. clasificacion != null && clasificacion != "".
	 * @param anio. anio != null && anio != "".
	 * @param genero. genero != null && genero != "".
	 * @param fecha. fecha != null && fecha != "".
	 * @param ID. ID != null && ID != "".
	 * @return valor de verdad de si se realizo la agregacion.
	 */
	public boolean agregar(String titulo, String estudio, String version, String estado, int precio, String clasificacion,
			String anio, String genero, String fecha, String ID) {
		return bosque.agregar(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
	}
	
	/*
	 * Retorna un iterador con las películas de la tienda
	 * @return Iterador de las películas
	 */
	public Iterator<Pelicula> darPeliculas() {
		return bosque.darPeliculas();
	}
	/**
	 * Muestra la lista de las películas que cumplen una versión dada.
	 * @param version. version != null && version != "".
	 * @return Lista de las películas que cumplen la versión dada.
	 */
	public ListaSimple<Pelicula> buscarPorVersiones(String version){
		return bosque.buscarPorVersion(version);
	}
	
	/**
	 * Muestra la lista de las películas que cumplen una clasificación específica.
	 * @param Clasificación. clasificacion != null && clasificacion != "".
	 * @return Lista de las películas que cumplen la clasificación dada.
	 */	
	public ListaSimple<Pelicula> buscarPorClasificaciones(String clasificacion){
		return bosque.buscarPorClasificacion(clasificacion);
	}
	
	/*
	 * Guarda los cambios de las películas en su mismo archivo
	 * @throws Exception si ocurre un error con el archivo
	 */
	public void guardar() {
		try {
			admi.guardar();
		} catch(Exception e) {
			
		}
	}
	
	/**
	 * Devuelve una lista con las películas más costosas, que cumplen por lo menos con un género dado.
	 * @param generos. generos != null.
	 * @return Lista con las películas más costosas, que cumplen por lo menos con un género dado.
	 */
	public ListaSimple<Pelicula> masCostosos(String[] generos) {
		return bosque.masCostosos(generos);
	}
	
	/*
	 * Devuelve una lista de peliculas que tengan el titulo indicado.
	 * @param titulo. titulo != null && titulo != "".
	 * @return lista de peliculas que contengan el titulo indicado.
	 */
	public ListaSimple<Pelicula> buscarPorTitulo(String titulo){
		return bosque.buscarPorTitulo(titulo);
	}
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
	}
}
