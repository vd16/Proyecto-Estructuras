package modelo;

import java.util.Iterator;

import iterativo.ListaSimple;

public class TVBosque {

	private ListaSimple<Pelicula> lista;

	public TVBosque() {
		lista = new ListaSimple<Pelicula>();
	}

	public void cargar(String titulo, String estudio, String version, String estado, int precio, String clasificacion,
			String anio, String genero, String fecha, String ID) {
		Pelicula nueva = new Pelicula(titulo, estudio, version, estado, precio, clasificacion, anio, genero, fecha, ID);

		lista.agregar(nueva);
	}

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

	public void editar(String ID, Pelicula editada) throws Exception {
		boolean editado = false;
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
	
	public Iterator<Pelicula> buscarPeriodoDebut(String anio) throws Exception{
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> lis = new ListaSimple<>();
		boolean agregado = false;
		
		while(it.hasNext()) {
			Pelicula actual = it.next();
			
			if(actual.getAnio().equals(anio)) {
				lis.agregar(actual);
				agregado = true;
			}
		}
		
		
		if(agregado == false ) {
			throw new Exception("No se pudo encontrar elementos con ese año");
		}
		
		return lis.darElementos();
	}
	
	public Iterator<Pelicula> buscarPorTitulo(String titulo) 
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

		return listaTitulo.darElementos();
	} 
	
	public Iterator<Pelicula> buscarPorGenero(String genero) 
	{
		Iterator<Pelicula> it = darPeliculas();
		ListaSimple<Pelicula> listaGenero = new ListaSimple<Pelicula>();
		while (it.hasNext()) 
		{
			Pelicula actual = it.next();
			if (actual.getGenero().equals(genero)) 
			{
				listaGenero.agregar(actual);
			}
		}

		return listaGenero.darElementos();
	} 
	
	public void eliminarPelicula(String titulo) 
	{
		Iterator<Pelicula> it = darPeliculas();
		while (it.hasNext()) 
		{
			Pelicula actual = it.next();
			if (actual.getTitulo().equals(titulo)) 
			{
				lista.eliminar(actual);
			}
		}
	} 

	public Iterator<Pelicula> darPeliculas() {
		return lista.darElementos();
	}
}
