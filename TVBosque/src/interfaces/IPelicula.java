package interfaces;

public interface IPelicula {

	/*
	 * Retorna el título de la película
	 * @return Título de la película
	 */
	public String getTitulo();
	
	/*
	 * Le asigna un nuevo valor al título
	 * @param titulo
	 */
	public void setTitulo(String titulo);
	
	/*
	 * Retorna el estudio de la película
	 * @return Estudio de la película
	 */
	public String getEstudio();
	
	/*
	 * Le asigna un nuevo valor al estudio
	 * @param estudio
	 */
	public void setEstudio(String estudio);
	
	/*
	 * Retorna la versión de la película
	 * @return Versión de la película
	 */
	public String getVersion();
	
	/*
	 * Le asigna un nuevo valor a la versión
	 * @param version
	 */
	public void setVersion(String version);
	
	/*
	 * Retorna el estado de la película
	 * @return Estado de la película
	 */
	public String getEstado();
	
	/*
	 * Le asigna un nuevo valor al estado
	 * @param estado
	 */
	public void setEstado(String estado);
	
	/*
	 * Retorna el precio de la película
	 * @return Precio de la película
	 */
	public int getPrecio();
	
	/*
	 * Le asigna un nuevo valor al precio
	 * @param precio
	 */
	public void setPrecio(int precio);
	
	/*
	 * Retorna la clasificación de la película
	 * @return Clasificación de la película
	 */
	public String getClasificacion();
	
	/*
	 * Le asigna un nuevo valor a la clasificación
	 * @param clasificacion
	 */
	public void setClasificacion(String clasificacion);
	
	/*
	 * Retorna el año de debut de la película
	 * @return Año de la película
	 */
	public String getAnio();
	
	/*
	 * Le asigna un nuevo valor al año
	 * @param anio
	 */
	public void setAnio(String anio);
	
	/*
	 * Retorna el género de la película
	 * @return Género de la película
	 */
	public String getGenero();
	
	/*
	 * Le asigna un nuevo valor al género.
	 * @param genero
	 */
	public void setGenero(String genero);
	
	/*
	 * Retorna la fecha de la película
	 * @return Fecha de la película
	 */
	public String getFecha();
	
	/*
	 * Le asigna un nuevo valor a la fecha
	 * @param fecha
	 */
	public void setFecha(String fecha);
	
	/*
	 * Retorna el ID de la película.
	 * @return ID de la película
	 */
	public String getID();
	
	/*
	 * Le asigna un nuevo valor al ID
	 * @param iD
	 */
	public void setID(String iD);
}
