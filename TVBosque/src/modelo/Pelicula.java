package modelo;

import interfaces.IPelicula;

/*
 * Representa una película
 */
public class Pelicula implements IPelicula{
	
	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

	/*
	 * Título de la película
	 */
	private String titulo;
	
	/*
	 * Estudio de la película
	 */
	private String estudio;
	
	/*
	 * Versión de la película
	 */
	private String version;
	
	/*
	 * Estado de la película
	 */
	private String estado;
	
	/*
	 * Precio de la película
	 */
	private int precio;
	
	/*
	 * Clasificación de la película
	 */
	private String clasificacion;
	
	/*
	 * Año de la película
	 */
	private String anio;
	
	/*
	 * Género de la película
	 */
	private String genero;
	
	/*
	 * Fecha de la película
	 */
	private String fecha;
	
	/*
	 * ID de la película
	 */
	private String ID;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

	/*
	 * Crea una película con la infromación dada como parámetro. <b>post: </b> El título, el estudio, la versión, el estado, el precio, la clasificación, el año,
	 * el género, la fecha y el ID fueron inicializados con el valor dado.
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
	public Pelicula(String titulo, String estudio, String version, String estado, int precio, String clasificacion, String anio, String genero, String fecha, String ID) {
		this.titulo = titulo;
		this.estudio = estudio;
		this.version = version;
		this.estado = estado;
		this.precio = precio;
		this.clasificacion = clasificacion;
		this.anio = anio;
		this.genero = genero;
		this.fecha = fecha;
		this.ID = ID;
	}

	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

	/*
	 * Retorna el título de la película
	 * @return Título de la película
	 */
	public String getTitulo() {
		return titulo;
	}

	/*
	 * Le asigna un nuevo valor al título
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*
	 * Retorna el estudio de la película
	 * @return Estudio de la película
	 */
	public String getEstudio() {
		return estudio;
	}

	/*
	 * Le asigna un nuevo valor al estudio
	 * @param estudio
	 */
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	/*
	 * Retorna la versión de la película
	 * @return Versión de la película
	 */
	public String getVersion() {
		return version;
	}

	/*
	 * Le asigna un nuevo valor a la versión
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/*
	 * Retorna el estado de la película
	 * @return Estado de la película
	 */
	public String getEstado() {
		return estado;
	}

	/*
	 * Le asigna un nuevo valor al estado
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/*
	 * Retorna el precio de la película
	 * @return Precio de la película
	 */
	public int getPrecio() {
		return precio;
	}

	/*
	 * Le asigna un nuevo valor al precio
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/*
	 * Retorna la clasificación de la película
	 * @return Clasificación de la película
	 */
	public String getClasificacion() {
		return clasificacion;
	}

	/*
	 * Le asigna un nuevo valor a la clasificación
	 * @param clasificacion
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	/*
	 * Retorna el año de debut de la película
	 * @return Año de la película
	 */
	public String getAnio() {
		return anio;
	}
	
	/*
	 * Le asigna un nuevo valor al año
	 * @param anio
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}

	/*
	 * Retorna el género de la película
	 * @return Género de la película
	 */
	public String getGenero() {
		return genero;
	}

	/*
	 * Le asigna un nuevo valor al género.
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/*
	 * Retorna la fecha de la película
	 * @return Fecha de la película
	 */
	public String getFecha() {
		return fecha;
	}

	/*
	 * Le asigna un nuevo valor a la fecha
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/*
	 * Retorna el ID de la película.
	 * @return ID de la película
	 */
	public String getID() {
		return ID;
	}

	/*
	 * Le asigna un nuevo valor al ID
	 * @param iD
	 */
	public void setID(String iD) {
		ID = iD;
	}
	
}
