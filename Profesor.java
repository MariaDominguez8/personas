package ar.com.ada.backend12.ejercicio5grupo;

import ar.com.ada.backend12.util.random.Random;

public class Profesor extends Persona {

	// ---------- ATRIBUTOS ----------//
	private String categoria;
	static final String[] ARRCAT = { "Universitario", "Escolar" };

	// ---------- CONSTRUCTOR ----------//

	/**
	 * Constructor para crear una persona de tipo Profesor.
	 * 
	 * @param nombre y apellido son cadenas de caracteres que contiene al nombre o
	 *               apellido random según sea su caso. edad es un entero que
	 *               contiene la edad en años que tendra la persona.
	 */
	public Profesor(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.categoria = Random.obtener(ARRCAT);
	}

	// ---------- METODOS ----------//

	/**
	 * Estos métodos (enseniarHistoria y enseniarMatematicas) dan una breve
	 * descripción sobre lo que esta haciendo ese tipo de persona.
	 * 
	 * @return una cadena de texto que contiene una breve descripción.
	 */
	public static String enseniarHistoria() {
		return "Estoy enseñando historia";
	};

	public static String enseniarMatematicas() {
		return "Estoy enseñando matemática";
	}

	// ---------- METODOS GETTERS ----------//

	public String getCategoria() {
		return categoria;
	}

	/**
	 * Este método sobreescribe el método saludar() que ya existe en la clase
	 * Persona. Agregamos que imprima, además del saludo, la profesión y lo que
	 * hace.
	 * 
	 * @return void.
	 */
	@Override
	public void saludar() {
		super.saludar();
		System.out.println("Soy un Profesor");
		System.out.println("Imparto clases a nivel " + getCategoria());
	}

	@Override
	public String toString() {
		return "Profesor [categoria=" + categoria + "]";
	}

}
