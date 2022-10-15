package ar.com.ada.backend12.ejercicio5grupo;

import ar.com.ada.backend12.util.random.Random;

public class Persona {

	// ---------- ATRIBUTOS ----------//
	protected String nombre;
	protected String apellido;
	protected int identificacion;
	protected int edad;

	// ---------- CONSTRUCTOR ----------//

	/**
	 * Constructor para crear una persona.
	 * 
	 * @param nombre y apellido son cadenas de caracteres que contiene al nombre o
	 *               apellido random según sea su caso. edad es un entero que
	 *               contiene la edad en años que tendra la persona.
	 */
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = Random.obtener(10000000, idGenerator);
		this.edad = filtroEdad(edad);

	}

	static final int idGenerator = Random.obtener(10000000, 99999999); // Generamos un id random de 8 digitos

	// ---------- METODOS ----------//

	/**
	 * 
	 * Este método privado se encarga de validar si la persona tiene entre 18 y 50
	 * años de edad y esto no se cumple, retorna -1.
	 * 
	 * @param edad es un entero con la edad en años de la persona.
	 * @return La edad de la persona, solo si esta tiene entre 18 y 50 años. Si no,
	 *         retornara -1 como "error".
	 */
	private int filtroEdad(int edad) {
		if (edad >= 18 && edad <= 50) {
			return edad;

		} else {
			return -1;
		}
	}

	/**
	 * Este método se encarga de imprimir un saludo - presentacion de cada persona.
	 */
	public void saludar() {
		System.out.println("Hola! Mi nombre es " + nombre + apellido + ".");
	}

	/**
	 * Este método se encarga de imprimir el número de identificación y la edad de
	 * cada persona.
	 */
	public void identificarse() {
		System.out.println("Mi ID es " + identificacion + " y tengo " + edad + " años.");
	}

	/**
	 * Este método se encarga de imprimir un saludo de despedida.
	 */
	public void despedirse() {
		System.out.println("Adios!");
	}

}
