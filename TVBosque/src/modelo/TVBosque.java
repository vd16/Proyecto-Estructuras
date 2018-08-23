package modelo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import iterativo.ListaSimple;

/*
 * Representa la tienda de películas
 */
public class TVBosque {

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/*
	 * Lista Enlazada de películas
	 */
	private ListaSimple<Pelicula> lista;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/*
	 * Crea una nueva tienda de películas. <br> <b>post: </b> Se inicializa la lista
	 * enlazada.
	 */
	public TVBosque() {
		lista = new ListaSimple<Pelicula>();
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

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
			String anio, String genero, String fecha, String ID) {
		Pelicula nueva = new Pelicula(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);

		lista.agregar(nueva);
	}

	/*
	 * Busca una película según su ID. <br>
	 * 
	 * @param ID ID de la película. ID != null && ID != "".
	 * 
	 * @return La película buscada.
	 */
	public Pelicula buscarPorID(String ID) {
		Iterator<Pelicula> it = darPeliculas();
		Pelicula buscada = null;
		while (it.hasNext()) {
			Pelicula actual = it.next();
			if (actual.getID().equals(ID)) {
				buscada = actual;
			}
		}

		return buscada;
	}

	/*
	 * Edita una película según petición del usuario. <br> <b>post: </b>Se le
	 * asignan nuevos datos a la película deseada.
	 * 
	 * @param ID ID de la película. ID != null && ID != "".
	 * 
	 * @param editada Película editada por el usuario. editada != null.
	 */
	public void editar(String ID, Pelicula editada) throws Exception {
		Pelicula editar = buscarPorID(ID);
		if (editar == null) {
			throw new Exception("No se pudo editar la película");
		}
		editar.setAnio(editada.getAnio());
		editar.setClasificacion(editada.getClasificacion());
		editar.setEstado(editada.getEstado());
		editar.setEstudio(editada.getEstudio());
		editar.setFecha(editada.getFecha());
		editar.setGenero(editada.getGenero());
		editar.setPrecio(editada.getPrecio());
		editar.setTitulo(editada.getTitulo());
		editar.setVersion(editada.getVersion());

		System.out.println(editar.getTitulo());
	}

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
	public ListaSimple<Pelicula> buscarPeriodoDebut(String anio) throws Exception {
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> lis = new ListaSimple<>();
		boolean agregado = false;

		while (it.hasNext()) {
			Pelicula actual = it.next();

			if (actual.getAnio().equals(anio)) {
				lis.agregar(actual);
				agregado = true;
			}
		}

		if (agregado == false) {
			throw new Exception("No se pudo encontrar elementos con ese año");
		}

		return lis;
	}

	/*
	 * Retorna la lista de las películas de un género específico
	 * @param genero. genero != null && genero != "".
	 * @return Lista de las películas de un género específico.
	 */
	public ListaSimple<Pelicula> buscarPorGenero(String genero) {
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> listaGenero = new ListaSimple<Pelicula>();
		while (it.hasNext()) {
			Pelicula actual = it.next();
			if (actual.getGenero().equals(genero)) {
				listaGenero.agregar(actual);
			}
		}

		return listaGenero;
	}

	/**
	 * Devuelve una lista con las películas más costosas, que cumplen por lo menos con un género dado.
	 * @param generos. generos != null.
	 * @return Lista con las películas más costosas, que cumplen por lo menos con un género dado.
	 */
	public ListaSimple<Pelicula> masCostosos(String[] generos) {
		ListaSimple<Pelicula> lis = new ListaSimple<>();
		for (int i = 0; i < generos.length; i++) {
			Iterator<Pelicula> it2 = buscarPorGenero(generos[i]).darElementos();
			if(it2.hasNext()) {
				Pelicula mayor = it2.next();
				Iterator<Pelicula> it3 = buscarPorGenero(generos[i]).darElementos();
				while (it3.hasNext()) {
					Pelicula actual = it3.next();
					if (mayor.getPrecio() < actual.getPrecio() ) {
						mayor = actual;
					}
				}

			lis.agregar(mayor);
			}
		}

		return lis;
	}

	/*
	 * Devuelve una lista de peliculas que tengan el titulo indicado.
	 * @param titulo. titulo != null && titulo != "".
	 * @return lista de peliculas que contengan el titulo indicado.
	 */ 
	public ListaSimple<Pelicula> buscarPorTitulo(String titulo) 
	{
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> listaTitulo = new ListaSimple<Pelicula>();
		while (it.hasNext()) 
		{
			Pelicula actual = it.next();
			if (actual.getTitulo().contains(titulo)) 
			{
				listaTitulo.agregar(actual);
			}
		}

		return listaTitulo;
	} 
	
	/**
	 * Muestra la lista de las películas que cumplen una clasificación específica.
	 * @param Clasificación. clasificacion != null && clasificacion != "".
	 * @return Lista de las películas que cumplen la clasificación dada.
	 */
	public ListaSimple<Pelicula> buscarPorClasificacion(String clasificacion)
	{
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> listaClasificaciones = new ListaSimple<Pelicula>();
		while (it.hasNext()) {
			Pelicula actual = it.next();
			if (actual.getClasificacion().equals(clasificacion)) {
				listaClasificaciones.agregar(actual);
			}
		}

		return listaClasificaciones;
	}
	
	/**
	 * Muestra la lista de las películas que cumplen una versión dada.
	 * @param version. version != null && version != "".
	 * @return Lista de las películas que cumplen la versión dada.
	 */
	public ListaSimple<Pelicula> buscarPorVersion(String version)
	{
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> listaVersiones = new ListaSimple<Pelicula>();
		while (it.hasNext()) {
			Pelicula actual = it.next();
			if (actual.getVersion().equals(version)) {
				listaVersiones.agregar(actual);
			}
		}

		return listaVersiones;
	}
	
	/*
	 * Elimina una o varias películas
	 * @param ID Arreglo con los IDs de las películas a eliminar.
	 */
	public void eliminarPelicula(String[] ID) {
		for (int i = 0; i < ID.length; i++) {
			Pelicula eliminar = buscarPorID(ID[i]);
			lista.eliminado(eliminar);
		}
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
			String anio, String genero, String fecha, String ID)
	{
		Pelicula nueva = new Pelicula(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);
		if(this.buscarPorID(ID) == null)
		{
			lista.agregar(nueva);
			return true;
		}
		return false;
	}


	/*
	 * Retorna un iterador con las películas de la tienda
	 * 
	 * @return Iterador de las películas
	 */
	public Iterator<Pelicula> darPeliculas() {
		return lista.darElementos();
	}
}
