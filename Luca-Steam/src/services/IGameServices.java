package services;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.Game;



public interface IGameServices {

	public boolean registerGame();
	public boolean registerGame(Game j) throws FileNotFoundException, IOException;
	public void listGames();
}
