package modelo;

import interfaces.IPelicula;

/*
 * Representa una pel�cula
 */
public class Pelicula implements IPelicula{
	
	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

	/*
	 * T�tulo de la pel�cula
	 */
	private String titulo;
	
	/*
	 * Estudio de la pel�cula
	 */
	private String estudio;
	
	/*
	 * Versi�n de la pel�cula
	 */
	private String version;
	
	/*
	 * Estado de la pel�cula
	 */
	private String estado;
	
	/*
	 * Precio de la pel�cula
	 */
	private int precio;
	
	/*
	 * Clasificaci�n de la pel�cula
	 */
	private String clasificacion;
	
	/*
	 * A�o de la pel�cula
	 */
	private String anio;
	
	/*
	 * G�nero de la pel�cula
	 */
	private String genero;
	
	/*
	 * Fecha de la pel�cula
	 */
	private String fecha;
	
	/*
	 * ID de la pel�cula
	 */
	private String ID;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

	/*
	 * Crea una pel�cula con la infromaci�n dada como par�metro. <b>post: </b> El t�tulo, el estudio, la versi�n, el estado, el precio, la clasificaci�n, el a�o,
	 * el g�nero, la fecha y el ID fueron inicializados con el valor dado.
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
    // M�todos
    // -----------------------------------------------------------------

	/*
	 * Retorna el t�tulo de la pel�cula
	 * @return T�tulo de la pel�cula
	 */
	public String getTitulo() {
		return titulo;
	}

	/*
	 * Le asigna un nuevo valor al t�tulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*
	 * Retorna el estudio de la pel�cula
	 * @return Estudio de la pel�cula
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
	 * Retorna la versi�n de la pel�cula
	 * @return Versi�n de la pel�cula
	 */
	public String getVersion() {
		return version;
	}

	/*
	 * Le asigna un nuevo valor a la versi�n
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/*
	 * Retorna el estado de la pel�cula
	 * @return Estado de la pel�cula
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
	 * Retorna el precio de la pel�cula
	 * @return Precio de la pel�cula
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
	 * Retorna la clasificaci�n de la pel�cula
	 * @return Clasificaci�n de la pel�cula
	 */
	public String getClasificacion() {
		return clasificacion;
	}

	/*
	 * Le asigna un nuevo valor a la clasificaci�n
	 * @param clasificacion
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	/*
	 * Retorna el a�o de debut de la pel�cula
	 * @return A�o de la pel�cula
	 */
	public String getAnio() {
		return anio;
	}
	
	/*
	 * Le asigna un nuevo valor al a�o
	 * @param anio
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}

	/*
	 * Retorna el g�nero de la pel�cula
	 * @return G�nero de la pel�cula
	 */
	public String getGenero() {
		return genero;
	}

	/*
	 * Le asigna un nuevo valor al g�nero.
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/*
	 * Retorna la fecha de la pel�cula
	 * @return Fecha de la pel�cula
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
	 * Retorna el ID de la pel�cula.
	 * @return ID de la pel�cula
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
