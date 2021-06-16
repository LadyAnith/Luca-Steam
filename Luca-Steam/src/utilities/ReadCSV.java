package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Clase encargada de leer un fichero CSV
 * @author alumno
 *
 */
public class ReadCSV {
	private static final Logger LOGGER = Logger.getLogger(ReadCSV.class);

	private static String NOMBRE_CSV = "vgsales.csv";
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
