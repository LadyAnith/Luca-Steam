package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import model.Platform;

/**
 * Nombre Clase: PlatformTest.java 
 * Descripcion: Clase de pruebas unitarias para testear el enum Platform. 
 * 
 * @since 16/06/2021 
 * @version 1.0
 * @author Ana Díaz, Sara Sevillano, Rebeca Martínez, Rocio Jimenez, Ana Mª Ramírez
 */
class PlatformTest {
	/**
	 * Prueba que espera que el resultado del Enum Platform sea correcto
	 */
	@Test
	public void testgetPlatform() {

		int num = 10;
		Platform plataformaEsperada = Platform.PS4;
		Platform plataformaReal = Platform.tellMePlatform(num);
		Assert.assertEquals(plataformaEsperada, plataformaReal);
	}

	/**
	 * Test que espera que el resultado del Enum Platform sea falso
	 */
	@Test
	public void testgetPlataformaDiferente() {

		int num = 12;
		Platform plataformaEsperada = Platform.PC;
		Platform plataformaReal = Platform.tellMePlatform(num);
		Assert.assertFalse(plataformaEsperada.equals(plataformaReal));
	}

	/**
	 * Test que espera que el resultado erroneo en el Enum Platform nos dará una
	 * Excepción
	 */
	@Test
	public void testgetPlataformaErronea() {
		boolean excepcionEsperada = true;
		try {
			int num = 21;
			Platform plataformaEsperada = Platform.X360;
			Platform plataformaReal = Platform.tellMePlatform(num);
			Assert.assertFalse(plataformaEsperada.equals(plataformaReal));
		} catch (Exception e) {
			Assert.assertTrue(excepcionEsperada);
		}
	}
}

