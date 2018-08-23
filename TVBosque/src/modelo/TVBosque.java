package modelo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import iterativo.ListaSimple;

/*
 * Representa la tienda de pel�culas
 */
public class TVBosque {

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/*
	 * Lista Enlazada de pel�culas
	 */
	private ListaSimple<Pelicula> lista;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/*
	 * Crea una nueva tienda de pel�culas. <br> <b>post: </b> Se inicializa la lista
	 * enlazada.
	 */
	public TVBosque() {
		lista = new ListaSimple<Pelicula>();
	}

	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------

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
			String anio, String genero, String fecha, String ID) {
		Pelicula nueva = new Pelicula(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);

		lista.agregar(nueva);
	}

	/*
	 * Busca una pel�cula seg�n su ID. <br>
	 * 
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 * 
	 * @return La pel�cula buscada.
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
	 * Edita una pel�cula seg�n petici�n del usuario. <br> <b>post: </b>Se le
	 * asignan nuevos datos a la pel�cula deseada.
	 * 
	 * @param ID ID de la pel�cula. ID != null && ID != "".
	 * 
	 * @param editada Pel�cula editada por el usuario. editada != null.
	 */
	public void editar(String ID, Pelicula editada) throws Exception {
		Pelicula editar = buscarPorID(ID);
		if (editar == null) {
			throw new Exception("No se pudo editar la pel�cula");
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
	 * Busca pel�culas seg�n su per�odo anual de debut y las agrega a una lista
	 * enlazada. <br>
	 * 
	 * @param anio A�o de la pel�cula. anio != null && anio != "".
	 * 
	 * @return Iterador de la lista con las pel�culas buscadas.
	 * 
	 * @throws Exception si no se encuentran pel�culas.
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
			throw new Exception("No se pudo encontrar elementos con ese a�o");
		}

		return lis;
	}

	
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
	
	
	public void eliminarPelicula(String titulo) 
	{
		Iterator<Pelicula> it = darPeliculas();
		while (it.hasNext()) 
		{
			Pelicula actual = it.next();
			if (actual.getTitulo().equals(titulo)) 
			{
				lista.eliminado(actual);
			}
		}
	} 
	
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
	 * Retorna un iterador con las pel�culas de la tienda
	 * 
	 * @return Iterador de las pel�culas
	 */
	public Iterator<Pelicula> darPeliculas() {
		return lista.darElementos();
	}
}
