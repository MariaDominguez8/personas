package ar.com.ada.backend12.ejercicio5grupo;

public class Medico extends Persona {
	// ---------- ATRIBUTOS ----------//
	private int numeroDePacientesTratados;

	// ---------- CONSTRUCTOR ----------//

	/**
	 * Constructor para crear una persona de tipo Medico.
	 * 
	 * @param nombre y apellido son cadenas de caracteres que contiene al nombre o
	 *               apellido random según sea su caso. edad es un entero que
	 *               contiene la edad en años que tendra la persona.
	 *               numeroDePacientesTratados es un entero que indica el número de
	 *               pacientes que trato el médico.
	 */

	public Medico(String nombre, String apellido, int edad, int numeroDePacientesTratados) {
		super(nombre, apellido, edad);
		this.numeroDePacientesTratados = numeroDePacientesTratados;
	}

	// ---------- METODOS ----------//

	/**
	 * Estos métodos (tratarPaciente y hacerInvestigacion) dan una breve descripción
	 * sobre lo que esta haciendo ese tipo de persona.
	 * 
	 * @return una cadena de texto que contiene una breve descripción.
	 */
	public static String tratarPaciente() {

		return "Trato a pacientes que vienen a realizar consultas, algunos por control y otros por enfermedades preexistentes";
	}

	public static String hacerInvestigacion() {
		return "Tengo que investigar constantemente el cuerpo humano para descubrir nuevas curas";
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
		System.out.println("Soy un médico.");
		System.out.println("Salvar vidas y ayudar a las personas a recuperar la salud es lo que más me gusta hacer.");
		System.out.println("Actualmente estoy investigando la cura para el cáncer.");
	}

	@Override
	public String toString() {
		return "Medico [numeroDePacientesTratados=" + numeroDePacientesTratados + "]";
	}

}
