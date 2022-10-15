package ar.com.ada.backend12.ejercicio5grupo;

public class Arquitecto extends Persona {

	// ---------- ATRIBUTOS ----------//
	int numeroDeObras;

	// ---------- CONSTRUCTOR ----------//

	/**
	 * Constructor para crear una Persona de tipo Arquitecto.
	 * 
	 * @param nombre y apellido son cadenas de caracteres que contiene al nombre o
	 *               apellido random seg�n sea su caso. edad es un entero que
	 *               contiene la edad en a�os que tendra la persona. numeroDeObras
	 *               es un entero que contiene el n�mero de obras en el que trabajo.
	 */
	public Arquitecto(String nombre, String apellido, int edad, int numeroDeObras) {
		super(nombre, apellido, edad);
		this.numeroDeObras = numeroDeObras;

	}

	// ---------- METODOS ----------//

	/**
	 * Estos m�todos (diseniarEdificio y diseniarPuente) dan una breve descripci�n
	 * sobre lo que esta haciendo ese tipo de persona.
	 * 
	 * @return una cadena de texto que contiene una breve descripci�n.
	 */
	public static String diseniarEdificio() {
		return "Actualmente dise�o dos torres en Capital. ";
	}

	public static String diseniarPuente() {
		return "Actualmente dise�o un puente en el Oriente. ";
	}

	/**
	 * Este m�todo sobreescribe el m�todo saludar() que ya existe en la clase
	 * Persona. Agregamos que imprima, adem�s del saludo, la profesi�n y lo que
	 * hace.
	 * 
	 * @return void.
	 */
	@Override
	public void saludar() {
		super.saludar();
		System.out.println("Soy un arquitecto");
		System.out.println("Mi tarea es dise�ar");

	}

	@Override
	public String toString() {
		return "Arquitecto [numeroDeObras=" + numeroDeObras + "]";
	}

}
