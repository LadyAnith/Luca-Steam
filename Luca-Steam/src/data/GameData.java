package data;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import model.Game;
import model.Genre;
import model.Platform;
import utilities.ReadCSV;


public class GameData implements IGameData{
	private static final Logger LOGGER = Logger.getLogger(GameData.class);
	
	
	//ATRIBUTO
	private Map<Integer, Game> games; 
	

	
	
	//CONSTRUCTOR
	public GameData() {
		games = new HashMap<>();
	}
	
	
	//GETTER
	public Map<Integer, Game> getGame(){
		return games;
	}
	
	
	//SETTER
	public void setGame(Map<Integer,Game> game) {
		this.games =game;
	}
	
	
	//OBTENER GENEROS
	public void filterGenre() {
		//Cómo puedo leer todos los valores de un enum?
		
		List<Genre> genres = new ArrayList();
	
				
		for (Integer clave : games.keySet()) {
			Game juego = games.get(clave);
			Genre genre = juego.getGenre();
			boolean found = false;
			
			if(genres.size() == 0) { //Si la lista está vacía lo agrego automáticamente
				found = true;
				genres.add(genre);
				//break;
				
			}else {

				for(int i=0;i<genres.size();i++) { //Si no está vacía recorro sus valores y comparo para no repetir
					
					if(genres.get(i) == genre) {
						found = true;		
						break;
					}										
				}
				 if(!found && genre != null) {
					genres.add(genre);
					System.out.println(genre);
				}
				 
			}

		}
		
			}

	
	
	
	//LISTARJUEGOS
	
	public Map<Integer,Game> listGames(){
		List<String[]> stringFichero = ReadCSV.leerFichero();
		
		
		for(int i=1;i<stringFichero.size();i++) { //Recorro todos los elementos de la lista
			Game game = new Game();
			String[] arrayValues = stringFichero.get(i);
			for(int j=0;j<arrayValues.length;j++) { //Por cada elemento de la lista, recorro todos los elementos de su array
				
				String value = arrayValues[j];
										
					switch(j) {
					case 0: //Case por cada elemento y seteamos las propiedades
						int rankValue = Integer.parseInt(value);
						game.setRank(rankValue);
						break;
					case 1:
						game.setName(value);
						break;
					case 2:	
						//COMPROBAR nombres ENUM = excel
						
						if(value.equals("3DO")) {
							value = "TRESDO";
						}
						
						
						if(value.equals("2600")) {
							value = "A2600";
						}
						if(value.equals("3DS")) {
							value = "TRESDS";
						}
						
						Platform platform = Platform.valueOf(value);
						game.setPlatform(platform);
						break;
					case 3:
					if(!value.equals("N/A")) {
						int yearValue = Integer.parseInt(value);
						game.setYear(yearValue);
					}
						break;
					case 4:
						//Comprobar nombres de ENUM = nombres EXCEL
						
						if(value.equals("Role-Playing")) {
							value = "RolePlaying";
						}
					//	System.out.println(value);
						Genre genre = Genre.valueOf(value);
						game.setGenre(genre);
						break;
					case 5:
						game.setPublisher(value);
						break;
					case 6:
						float NA_SalesValue = Float.parseFloat(value);
						game.setNA_Sales(NA_SalesValue);
						break;
					case 7:
						float EU_SalesValue = Float.parseFloat(value);
						game.setEU_Sales(EU_SalesValue);
						break;
					case 8:
						float JP_SalesValue = Float.parseFloat(value);
						game.setJP_Sales(JP_SalesValue);
						break;
					case 9:
						float Other_salesValue = Float.parseFloat(value);
						game.setOther_sales(Other_salesValue);
						break;
					case 10:
						float Global_salesValue = Float.parseFloat(value);
						game.setGlobal_sales(Global_salesValue);
						break;
						
					}
				}
				
				//Añadir el juego a la lista de juegos
			
				games.put(i, game);
		}
		
		return games;
	}
	
	
	// METODO1: conversión array String - obj Juego
	//Metdo2: gestor id
	
	//METODO3: coleccion juegos
	
	
	//ALTA JUEGO
	

	public boolean registerGame(int id, Game j) {
		boolean value = false;

		if (id < 0) {
			LOGGER.error("ID No puede ser negativo");
			return false;
		}

		if (games.containsKey(id)) {
			LOGGER.error("ID existente, no se ha podido agregar el juego");
			value = false;
		} else {
			if (j == null) {
				LOGGER.error("No hay datos del juego que registrar");
				value = false;
			} else {
				games.put(id, j); // Preguntar si agregamos a la lista o directamente al fichero
				value = true;
			}
		}
		return value;
	}

}


	





