package ar.com.ada.backend12.ejercicio5grupo;

import ar.com.ada.backend12.util.random.Random;

public class Programador extends Persona {

	// ---------- ATRIBUTOS ----------//
	public static final String[] SO = { "Windows", "Linux", "MacOS" };
	private String soPreferido;

	// ---------- CONSTRUCTOR ----------//

	/**
	 * Constructor para crear una Persona de tipo Programador.
	 * 
	 * @param nombre y apellido son cadenas de caracteres que contiene al nombre o
	 *               apellido random según sea su caso. edad es un entero que
	 *               contiene la edad en años que tendra la persona.
	 */
	public Programador(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.soPreferido = Random.obtener(SO);
	}

	// ---------- METODOS ----------//

	/**
	 * Estos métodos (desarrollarSistema y desarrollarVideojuego) dan una breve
	 * descripción sobre lo que esta haciendo ese tipo de persona.
	 * 
	 * @return una cadena de texto que contiene una breve descripción.
	 */
	public static String desarrollarSistema() {
		return "Actualmente estoy desarrollando un sistema.";
	};

	public static String desarrollarVideojuego() {
		return "Actualmente estoy desarrollando un videojuego.";
	};

	// ---------- METODOS GETTERS ----------//
	public String getSoPreferido() {
		return soPreferido;
	}

	/**
	 * Este método sobreescribe el método saludar() que ya existe en la clase
	 * Persona. Agregamos que imprima, además del saludo, la profesión y su sistema
	 * operativo favorito.
	 * 
	 * @return void.
	 */
	@Override
	public void saludar() {
		super.saludar();
		System.out.println("Soy un Programador.");
		System.out.println("Mi sistema operativo favorito es " + getSoPreferido());

	}

	@Override
	public String toString() {
		return "Programador [soPreferido=" + soPreferido + "]";
	}

}
