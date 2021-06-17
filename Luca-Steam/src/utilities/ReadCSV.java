package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import model.Game;

/**
 * Nombre Clase: ReadCSV.java 
 * Descripcion: Clase encargada de leer un fichero CSV. 
 * 
 * @since 15/06/2021 
 * @version 1.0
 * @author Ana Mª Ramírez
 */
public class ReadCSV {
	/**
	 * Atributo estático para utilizar el Logger
	 */
	private static final Logger LOGGER = Logger.getLogger(ReadCSV.class);
	/**
	 * Atributo donde guardo el CSV
	 */
	private static String NOMBRE_CSV = "vgsales.csv";
	/**
	 * Atributo donde indico el delimitador del contenido del fichero
	 */
	private static String DELIMITADOR_CSV = ";";

	/**
	 * Método para leer un fichero CSV
	 * 
	 * @return Devuelve un listado con un array de string
	 */
	public static List<String[]> leerFichero() {
		List<String[]> resultado = new ArrayList<>();

		BufferedReader csvReader;
		try {
			csvReader = new BufferedReader(new FileReader(new File(NOMBRE_CSV)));
			String row;
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(DELIMITADOR_CSV);
				resultado.add(data);
			}
			csvReader.close();
		} catch (FileNotFoundException e) {
			LOGGER.error("Error al leer el fichero!!", e);
		} catch (IOException e) {
			LOGGER.error("Error al Leer la linea!!", e);
		}

		return resultado;
	}
}
