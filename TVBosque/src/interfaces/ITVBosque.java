package interfaces;

import java.util.Iterator;

import iterativo.ListaSimple;
import modelo.Pelicula;

/*
 * Interface que modela una tienda de libros 
 */
public interface ITVBosque {

	/*
	 * Carga todas las películas del archivo en la lista enlazada. <br> <b>post:
	 * </b>Se guardan todas las películas con sus datos.
	 * 
	 * @param titulo Título de la película. titulo != null && titulo != "".
	 * 
	 * @param estudio Estudio de la película. estudio != null && estudio != "".
	 * 
	 * @param version Versión de la película. version != null && version != "".
	 * 
	 * @param estado Estado de la película. estado != null && estado != "".
	 * 
	 * @param precio Precio de la película. precio >= 0.
	 * 
	 * @param clasificacion Clasificación de la película. clasificacion != null &&
	 * clasificacion != "".
	 * 
	 * @param anio Año de la película. anio != null && anio != "".
	 * 
	 * @param genero Género de la película. genero != null && genero != "".
	 * 
	 * @param fecha Fecha de la película. fecha != null && genero != "".
	 * 
	 * @param ID ID de la película. ID != null && ID != "".
	 */
	public void cargar(String titulo, String estudio, String version, String estado, int precio, String clasificacion,
			String anio, String genero, String fecha, String ID);
	
	/*
	 * Busca una película según su ID. <br>
	 * 
	 * @param ID ID de la película. ID != null && ID != "".
	 * 
	 * @return La película buscada.
	 */
	public Pelicula buscarPorID(String ID);
	
	/*
	 * Edita una película según petición del usuario. <br> <b>post: </b>Se le
	 * asignan nuevos datos a la película deseada.
	 * 
	 * @param ID ID de la película. ID != null && ID != "".
	 * 
	 * @param editada Película editada por el usuario. editada != null.
	 */
	public void editar(String ID, Pelicula editada) throws Exception;
	
	/*
	 * Busca películas según su período anual de debut y las agrega a una lista
	 * enlazada. <br>
	 * 
	 * @param anio Año de la película. anio != null && anio != "".
	 * 
	 * @return Iterador de la lista con las películas buscadas.
	 * 
	 * @throws Exception si no se encuentran películas.
	 */
	public ListaSimple<Pelicula> buscarPeriodoDebut(String anio) throws Exception;
	
	/*
	 * Retorna un iterador con las películas de la tienda
	 * 
	 * @return Iterador de las películas
	 */
	public Iterator<Pelicula> darPeliculas();
	
	/**
	 * Devuelve una lista con las películas más costosas, que cumplen por lo menos con un género dado.
	 * @param generos. generos != null.
	 * @return Lista con las películas más costosas, que cumplen por lo menos con un género dado.
	 */
	public ListaSimple<Pelicula> masCostosos(String[] generos);
	
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
	public boolean agregar(String titulo, String estudio, String version, String estado, int precio,
			String clasificacion, String anio, String genero, String fecha, String ID);
	
	/*
	 * Elimina una o varias películas
	 * @param ID Arreglo con los IDs de las películas a eliminar.
	 */
	public void eliminarPelicula(String[] ID);
	
	/**
	 * Muestra la lista de las películas que cumplen una versión dada.
	 * @param version. version != null && version != "".
	 * @return Lista de las películas que cumplen la versión dada.
	 */
	public ListaSimple<Pelicula> buscarPorVersion(String version);
	
	/**
	 * Muestra la lista de las películas que cumplen una clasificación específica.
	 * @param Clasificación. clasificacion != null && clasificacion != "".
	 * @return Lista de las películas que cumplen la clasificación dada.
	 */
	public ListaSimple<Pelicula> buscarPorClasificacion(String clasificacion);
	
	/*
	 * Devuelve una lista de peliculas que tengan el titulo indicado.
	 * @param titulo. titulo != null && titulo != "".
	 * @return lista de peliculas que contengan el titulo indicado.
	 */
	public ListaSimple<Pelicula> buscarPorTitulo(String titulo);
}
