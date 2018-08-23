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
	 * Retorna un iterador con las películas de la tienda
	 * @return Iterador de las películas
	 */
	public Iterator<Pelicula> darPeliculas() {
		return bosque.darPeliculas();
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
	
	public ListaSimple<Pelicula> masCostosos(String[] generos) {
		return bosque.masCostosos(generos);
	}
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
	}
}
