package model;
/*
 * Nombre Clase: Platform.java
 * Descripcion: Clase que es un enumerado con todas las plataformas de los juegos 
 * Fecha: 16/06/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

public enum Platform {
	
	Wii(1, "Nitendo Wii"), NES(2, "Nintendo Nes"), GB(3, "Game Boy"), DS(4, "Nitendo DS"), X360(5, "XBOX 360"),
	PS3(6, "Play Station 3"), PS2(7, "Play Station 2"), SNES(8, "Nitendo Super Nes"), GBA(9, "Game Boy Advance"),
	PS4(10, "Play Station 4"), N64(11, "Nitendo 64"), XB(12, "XBOX"), PSP(13, "Play Station Portable"),
	PS(14, "Play Station"), XOne(15, "XBOX One"), GC(16, "Nintendo Game Cube"), WiiU(17, "Nintendo Wii U"),
	TRESDS(18, "Nintendo 3DS"), PC(19, "Juegos PC"), A2600(20, "Atari 2600"), TRESDO(21,"3DO"), DC(22, "DC"),
	GEN(23, "GEN"), GG(24, "GG"), NG(25, "NG"), PCFX(26, "PCFX"), PSV(27, "PSV"), SAT(28, "SAT"), SCD(29, "SCD"),
	TG16(30, "TG16"), WS(31, "WS");

	// ----------------------
	// Atributos
	// ----------------------

	/**
	 * Identificador de la posicion juego
	 */
	private final int pos;

	/**
	 * Plataforma del juego
	 */
	private final String platform;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor con 2 parametros
	 * 
	 * @param pos      posicion de la plataforma
	 * @param platform plataforma del juego
	 */
	private Platform(int pos, String platform) {
		this.pos = pos;
		this.platform = platform;

	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve la posicion de la plataforma
	 * 
	 * @return posicion de la plataforma
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * Metodo que devuelve las plataformas de juegos
	 * 
	 * @return plataforma del juego
	 */
	public String getPlatform() {
		return platform;
	}

	// Lo hacemos porque en Java no podemos pasar bien de int a enum y hacemos un
	// poco esta trampa
	private static Platform[] values = null;


	/**
	 * Metodo que dirá la plataforma de los juegos
	 */
	public static Platform tellMePlatform(int pf) {
		if (Platform.values == null) {
			Platform.values = Platform.values();
		}
		return Platform.values[pf - 1];
	}

	/**
	 * Metodo que muestra el informe de las plataformas de los juegos
	 */
	public static void Summary() {
		StringBuilder sb;
		for (Platform pf : Platform.values()) {
			sb = new StringBuilder();
			sb.append("(").append(pf.platform).append(")").append(pf).append("|");
			System.out.println(sb);
		}
	}
}
