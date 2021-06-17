package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import model.Genre;

/**
 * Nombre Clase: GenreTest.java 
 * Descripcion: Clase de pruebas unitarias para testear el enum Genre. 
 * 
 * @since 16/06/2021 
 * @version 1.0
 * @author Ana Díaz, Sara Sevillano, Rebeca Martínez, Rocio Jimenez, Ana Mª Ramírez
 */
class GenreTest {
	/**
	 * Prueba que espera que el resultado del Enum Genre sea correcto
	 */
	@Test
	public void testgetGenero() {

		int num = 6;
		Genre generoEsperado = Genre.Misc;
		Genre generoReal = Genre.tellMeGenre(num);
		Assert.assertEquals(generoEsperado, generoReal);
	}

	/**
	 * Test que espera que el resultado del Enum Genre sea falso
	 */
	@Test
	public void testgetGeneroDiferente() {

		int num = 3;
		Genre generoEsperado = Genre.Adventure;
		Genre generoReal = Genre.tellMeGenre(num);
		Assert.assertFalse(generoEsperado.equals(generoReal));
	}

	/**
	 * Test que espera que un resultado erroneo de un Enum Genre nos dará una
	 * Excepción
	 */
	@Test
	public void testgetGeneroErroneo() {
		boolean excepcionEsperada = true;
		try {
			int num = 15;
			Genre generoEsperado = Genre.Shooter;
			Genre generoReal = Genre.tellMeGenre(num);
			Assert.assertFalse(generoEsperado.equals(generoReal));
		} catch (Exception e) {
			Assert.assertTrue(excepcionEsperada);
		}
	}
}