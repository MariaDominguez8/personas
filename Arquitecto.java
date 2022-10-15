package ar.com.ada.backend12.ejercicio5grupo;

public class Arquitecto extends Persona {

	// ---------- ATRIBUTOS ----------//
	int numeroDeObras;

	// ---------- CONSTRUCTOR ----------//

	/**
	 * Constructor para crear una Persona de tipo Arquitecto.
	 * 
	 * @param nombre y apellido son cadenas de caracteres que contiene al nombre o
	 *               apellido random según sea su caso. edad es un entero que
	 *               contiene la edad en años que tendra la persona. numeroDeObras
	 *               es un entero que contiene el número de obras en el que trabajo.
	 */
	public Arquitecto(String nombre, String apellido, int edad, int numeroDeObras) {
		super(nombre, apellido, edad);
		this.numeroDeObras = numeroDeObras;

	}

	// ---------- METODOS ----------//

	/**
	 * Estos métodos (diseniarEdificio y diseniarPuente) dan una breve descripción
	 * sobre lo que esta haciendo ese tipo de persona.
	 * 
	 * @return una cadena de texto que contiene una breve descripción.
	 */
	public static String diseniarEdificio() {
		return "Actualmente diseño dos torres en Capital. ";
	}

	public static String diseniarPuente() {
		return "Actualmente diseño un puente en el Oriente. ";
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
		System.out.println("Soy un arquitecto");
		System.out.println("Mi tarea es diseñar");

	}

	@Override
	public String toString() {
		return "Arquitecto [numeroDeObras=" + numeroDeObras + "]";
	}

}
