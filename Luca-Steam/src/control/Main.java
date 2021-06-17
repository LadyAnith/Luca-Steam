package control;


import java.util.Map;

import data.GameData;
import model.Game;


public class Main {

	public static void main(String[] args) {


		GameData gameData = new GameData();
		Map<Integer, Game> listGames = gameData.listGames();
		
		for (Integer clave : listGames.keySet()) {
			Game juego = (Game) listGames.get(clave);
		//	System.out.println(clave + " : " + juego);
			}
		
		gameData.filterGenre();
		


	}
}