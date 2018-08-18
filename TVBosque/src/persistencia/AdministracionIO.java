package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import modelo.TVBosque;

public class AdministracionIO {

	private TVBosque bosque;
	
	public AdministracionIO(TVBosque bosque) {
		this.bosque = bosque;
	}
	
	public void cargar()throws Exception
	{
		File file = new File("./data/DVD.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bf = new BufferedReader(fr);
		String linea;
		
		while((linea = bf.readLine()) != null) {
			String[] pelicula = linea.split(";");
			
			bosque.cargar(pelicula[0], pelicula[1], pelicula[2], pelicula[3], Integer.parseInt(pelicula[4]) , pelicula[5],
						pelicula[6], pelicula[7], pelicula[8], pelicula[9]);
		}
	}
	
}
