package test;

import org.junit.jupiter.api.Test;

import data.GameData;
import model.Game;
import model.Genre;
import model.Platform;

/**
 * Nombre Clase: GameDataTest.java 
 * Descripcion: Clase de pruebas unitarias para testear el método de la clase GameData registerGame. 
 * 
 * @since 16/06/2021 
 * @version 1.0
 * @author Ana Díaz, Sara Sevillano, Rebeca Martínez, Rocio Jimenez, Ana Mª Ramírez
 */
class GameDataTest extends junit.framework.TestCase {
	/**
	 * Objetos necesarios para realizar las pruebas
	 */
	Game game = new Game(16599, "Ori", Platform.PC, 2019, Genre.Platform, "Nintendo", 5000, 12000, 20000, 8000, 4000);
	GameData gameData = new GameData();

	Game game1 = new Game(16600, "Tetris", Platform.PC, 2019, Genre.Puzzle, "Nintendo", 5000, 12000, 20000, 8000, 4000);
	Game game2 = new Game(16599, "The Witcher", Platform.PC, 2020, Genre.RolePlaying, "Playstation", 5000, 12000, 20000, 8000,
			4000);

	/**
	 * Introduzco datos en el HasMap de la clase Gamedata
	 */
	{
		gameData.getGame().put(1, game1);
		gameData.getGame().put(2, game2);
	}

	/**
	 * Test encargado de comprobar si el método registra un juego
	 */
	@Test
	public void test1ShouldRegistGame() {
		assertNotNull(game);
		boolean expectedResult = true;
		boolean realResult = gameData.registerGame(45, game);
		assertEquals(expectedResult, realResult);
	}

	/**
	 * Test que comprueba que un registro no esté duplicado
	 */
	@Test
	public void test2ShouldNotRegistGameDuplicated() {
		assertNotNull(game);
		boolean expectedResult = false;
		boolean realResult = gameData.registerGame(1, game1);
		assertEquals(expectedResult, realResult);

	}

	/**
	 * Test encargado de comprobar si un archivo nulo puede quedar registrado
	 */
	@Test
	public void testShouldNotRegistGameNull() {
		Game game = null;
		assertNull(game);
		boolean expectedResult = false;
		boolean realResult = gameData.registerGame(45, game);
		assertEquals(expectedResult, realResult);

	}

	/**
	 * Test que comprueba que un id negativo no se pueda registrar
	 */
	@Test
	public void testShouldNotRegistGameIDNegative() {
		assertNotNull(game);
		boolean expectedResult = false;
		boolean realResult = gameData.registerGame(-2057, game);
		assertEquals(expectedResult, realResult);
	}
	
}