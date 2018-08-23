package interfaces;

import java.util.Iterator;

import iterativo.ListaSimple;
import modelo.Pelicula;

/*
 * Interface que modela una tienda de libros 
 */
public interface ITVBosque {

	/*
	 * Carga todas las pel�culas del archivo en la lista enlazada. <br> <b>post:
	 * </b>Se guardan todas las pel�culas con sus datos.
	 * 
	 * @param titulo T�tulo de la pel�cula. titulo != null && titulo != "".
	 * 
	 * @param estudio Estudio de la pel�cula. estudio != null && estudio != "".
	 * 
	 * @param version Versi�n de la pel�cula. version != null && version != "".
	 * 
	 * @param estado Estado de la pel�cula. estado != null && estado != "".
	 * 
	 * @param precio Precio de la pel�cula. precio >= 0.
	 * 
	 * @param clasificacion Clasificaci�n de la pel�cula. clasificacion != null &&
	 * clasificacion != "".
	 * 
	 * @param anio A�o de la pel�cula. anio != null && anio != "".
	 * 
	 * @param genero G�nero de la pel�cula. genero != null && genero != "".
	 * 
	 * @param fecha Fecha de la pel�cula. fecha != null && genero != "".
	 * 
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 */
	public void cargar(String titulo, String estudio, String version, String estado, int precio, String clasificacion,
			String anio, String genero, String fecha, String ID);
	
	/*
	 * Busca una pel�cula seg�n su ID. <br>
	 * 
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 * 
	 * @return La pel�cula buscada.
	 */
	public Pelicula buscarPorID(String ID);
	
	/*
	 * Edita una pel�cula seg�n petici�n del usuario. <br> <b>post: </b>Se le
	 * asignan nuevos datos a la pel�cula deseada.
	 * 
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 * 
	 * @param editada Pel�cula editada por el usuario. editada != null.
	 */
	public void editar(String ID, Pelicula editada) throws Exception;
	
	/*
	 * Busca pel�culas seg�n su per�odo anual de debut y las agrega a una lista
	 * enlazada. <br>
	 * 
	 * @param anio A�o de la pel�cula. anio != null && anio != "".
	 * 
	 * @return Iterador de la lista con las pel�culas buscadas.
	 * 
	 * @throws Exception si no se encuentran pel�culas.
	 */
	public ListaSimple<Pelicula> buscarPeriodoDebut(String anio) throws Exception;
	
	/*
	 * Retorna un iterador con las pel�culas de la tienda
	 * 
	 * @return Iterador de las pel�culas
	 */
	public Iterator<Pelicula> darPeliculas();
	
	/**
	 * Devuelve una lista con las pel�culas m�s costosas, que cumplen por lo menos con un g�nero dado.
	 * @param generos. generos != null.
	 * @return Lista con las pel�culas m�s costosas, que cumplen por lo menos con un g�nero dado.
	 */
	public ListaSimple<Pelicula> masCostosos(String[] generos);
	
	/*
	 * Agrega una pel�cula con los par�metros dados
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
	 * Elimina una o varias pel�culas
	 * @param ID Arreglo con los IDs de las pel�culas a eliminar.
	 */
	public void eliminarPelicula(String[] ID);
	
	/**
	 * Muestra la lista de las pel�culas que cumplen una versi�n dada.
	 * @param version. version != null && version != "".
	 * @return Lista de las pel�culas que cumplen la versi�n dada.
	 */
	public ListaSimple<Pelicula> buscarPorVersion(String version);
	
	/**
	 * Muestra la lista de las pel�culas que cumplen una clasificaci�n espec�fica.
	 * @param Clasificaci�n. clasificacion != null && clasificacion != "".
	 * @return Lista de las pel�culas que cumplen la clasificaci�n dada.
	 */
	public ListaSimple<Pelicula> buscarPorClasificacion(String clasificacion);
	
	/*
	 * Devuelve una lista de peliculas que tengan el titulo indicado.
	 * @param titulo. titulo != null && titulo != "".
	 * @return lista de peliculas que contengan el titulo indicado.
	 */
	public ListaSimple<Pelicula> buscarPorTitulo(String titulo);
}
