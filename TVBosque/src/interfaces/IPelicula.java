package interfaces;

public interface IPelicula {

	/*
	 * Retorna el t�tulo de la pel�cula
	 * @return T�tulo de la pel�cula
	 */
	public String getTitulo();
	
	/*
	 * Le asigna un nuevo valor al t�tulo
	 * @param titulo
	 */
	public void setTitulo(String titulo);
	
	/*
	 * Retorna el estudio de la pel�cula
	 * @return Estudio de la pel�cula
	 */
	public String getEstudio();
	
	/*
	 * Le asigna un nuevo valor al estudio
	 * @param estudio
	 */
	public void setEstudio(String estudio);
	
	/*
	 * Retorna la versi�n de la pel�cula
	 * @return Versi�n de la pel�cula
	 */
	public String getVersion();
	
	/*
	 * Le asigna un nuevo valor a la versi�n
	 * @param version
	 */
	public void setVersion(String version);
	
	/*
	 * Retorna el estado de la pel�cula
	 * @return Estado de la pel�cula
	 */
	public String getEstado();
	
	/*
	 * Le asigna un nuevo valor al estado
	 * @param estado
	 */
	public void setEstado(String estado);
	
	/*
	 * Retorna el precio de la pel�cula
	 * @return Precio de la pel�cula
	 */
	public int getPrecio();
	
	/*
	 * Le asigna un nuevo valor al precio
	 * @param precio
	 */
	public void setPrecio(int precio);
	
	/*
	 * Retorna la clasificaci�n de la pel�cula
	 * @return Clasificaci�n de la pel�cula
	 */
	public String getClasificacion();
	
	/*
	 * Le asigna un nuevo valor a la clasificaci�n
	 * @param clasificacion
	 */
	public void setClasificacion(String clasificacion);
	
	/*
	 * Retorna el a�o de debut de la pel�cula
	 * @return A�o de la pel�cula
	 */
	public String getAnio();
	
	/*
	 * Le asigna un nuevo valor al a�o
	 * @param anio
	 */
	public void setAnio(String anio);
	
	/*
	 * Retorna el g�nero de la pel�cula
	 * @return G�nero de la pel�cula
	 */
	public String getGenero();
	
	/*
	 * Le asigna un nuevo valor al g�nero.
	 * @param genero
	 */
	public void setGenero(String genero);
	
	/*
	 * Retorna la fecha de la pel�cula
	 * @return Fecha de la pel�cula
	 */
	public String getFecha();
	
	/*
	 * Le asigna un nuevo valor a la fecha
	 * @param fecha
	 */
	public void setFecha(String fecha);
	
	/*
	 * Retorna el ID de la pel�cula.
	 * @return ID de la pel�cula
	 */
	public String getID();
	
	/*
	 * Le asigna un nuevo valor al ID
	 * @param iD
	 */
	public void setID(String iD);
}
