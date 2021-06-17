package services;

import java.io.FileNotFoundException;
import java.io.IOException;

import data.GameData;
import data.IGameData;
import model.Game;



public class GameServices<IDataJuegos> implements IGameServices {

	private IGameData dataGames = new GameData();
	
	
	public boolean registerGame() {
		Game j = new Game();
		//TODO: j.createGame(//TODO: Meter parámetros);
		return this.registerGame();
	}
	
	public boolean registerGame(Game j) throws FileNotFoundException, IOException {
		return false;
	}
	
	public void listGames() {
		//TODO: j.listarJuegos();
	}
}
