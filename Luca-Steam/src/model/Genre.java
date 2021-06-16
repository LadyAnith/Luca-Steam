package model;

/*
 * Nombre Clase: Genre.java
 * Descripcion: Clase que es un enumerado con todos los generos de los juegos 
 * Fecha: 16/06/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

public enum Genre {
	
	SP(1, "Sports"), PL(2, "Platform"), RC(3, "Racing"), RP(4, "Role-Playing"), P(5, "Puzzle"), M(6, "Misc"),
	SH(7, "Shooter"), A(8, "Action"), F(9, "Fighting"), AD(10, "Adventure"), SI(11, "Simulation"), S(12, "Strategy");


	// ----------------------
	// Atributos
	// ----------------------
	
	/**
	 * Identificador de la posicion del genero 
	 */
	private final int pos;
	/**
	 * Genero del juego
	 */
	private final String genre;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor con 2 parametros
	 * 
	 * @param pos   posicion del genero
	 * @param genre genero del juego
	 */
	private Genre(int pos, String genre) {
		this.pos = pos;
		this.genre = genre;
	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve la posicion del genero
	 * 
	 * @return posicion del juego
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * Metodo que devuelve los generos de juegos
	 * 
	 * @return generos de juegos
	 */
	public String getGenre() {
		return genre;
	}

	// Lo hacemos porque en Java no podemos pasar bien de int a enum y hacemos un
	// poco esta trampa
	private static Genre[] values = null;

	/**
	 * Metodo que dirá el genero de los juegos
	 */
	public static Genre tellMeGenre(int ge) {
		if (Genre.values == null) {
			Genre.values = Genre.values();
		}
		return Genre.values[ge - 1];
	}

	/**
	 * Metodo que muestra el informe de los generos de los juegos
	 */
	public static void Summary() {
		StringBuilder sb;
		for (Genre ge : Genre.values()) {
			sb = new StringBuilder();
			sb.append("(").append(ge.genre).append(")").append(ge).append("|");
			System.out.println(sb);
		}
	}
}
