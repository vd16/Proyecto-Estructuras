package modelo;

import java.io.Serializable;

public class Pelicula implements Serializable{

	private String titulo;
	private String estudio;
	private String version;
	private String estado;
	private int precio;
	private String clasificacion;
	private String anio;
	private String genero;
	private String fecha;
	private String ID;
	
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
}
