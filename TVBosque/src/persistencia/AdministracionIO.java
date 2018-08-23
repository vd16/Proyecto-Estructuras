package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;

import controlador.Controlador;
import modelo.Pelicula;
import modelo.TVBosque;

public class AdministracionIO {

	private Controlador c;

	public AdministracionIO(Controlador c) {
		this.c = c;
	}

	public void cargar() throws Exception {
		File file = new File("./data/DVD.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bf = new BufferedReader(fr);
		String linea;

		while ((linea = bf.readLine()) != null) {
			String[] pelicula = linea.split(";");

			c.cargarPelicula(pelicula[0], pelicula[1], pelicula[2], pelicula[3], Integer.parseInt(pelicula[4]),
					pelicula[5], pelicula[6], pelicula[7], pelicula[8], pelicula[9]);
		}
		
		bf.close();
	}

	public void guardar() throws Exception {
		File file = new File("./data/DVD.txt");
		PrintWriter pw = new PrintWriter(file);
		
		Iterator<Pelicula> lista = c.darPeliculas();
		
		while(lista.hasNext()){
			Pelicula actual = lista.next();
			pw.println(actual.getTitulo() + ";" + actual.getEstudio() + ";" + actual.getEstado() + ";" + actual.getVersion() + ";"
					+ actual.getPrecio() + ";" + actual.getClasificacion() + ";" + actual.getAnio() + ";" + actual.getGenero() + ";"
					+ actual.getFecha() + ";" + actual.getID());
		}
		
		pw.close();
	}

}
