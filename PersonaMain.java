package ar.com.ada.backend12.ejercicio5grupo;

import java.util.Scanner;

import ar.com.ada.backend12.util.random.Random;

public class PersonaMain {

	/**
	 * Este método se encarga de iniciar la ejecución del programar Éste es el
	 * método principal del proyecto
	 * 
	 * @param args[] es un arreglo con los parámetros que el reciba por consola
	 * @return void
	 */
	public static void main(String[] args) {

		// Importamos Scanner
		Scanner in = new Scanner(System.in);

		// Variable para guardar el numero de Personas
		final int N;

		System.out.println("Ingrese la cantidad de personas: ");
		N = in.nextInt();

		Persona[] personas = new Persona[N]; // {null,null}
		String[] NOMBRE = { "Juan ", "Miguel ", "Laura ", "Lucia ", "Lucas ", "Paula " };
		String[] APELLIDO = { "Hernandez", "Gonzales", "Rodriguez", "Gutierrez", "Pérez", "Gómez" };

		String[] metodo = new String[2];
		in.close();

		for (int i = 0; i < personas.length; i++) {
			int num = Random.obtener(0, 5);

			String nombre = Random.obtener(NOMBRE);
			String apellido = Random.obtener(APELLIDO);
			int edad = Random.obtener(18, 50);

			switch (num) {
			case 0:
				personas[i] = new Persona(nombre, apellido, edad);
				break;
			case 1:
				int pacientes = Random.obtener(0, 500);
				personas[i] = new Medico(nombre, apellido, edad, pacientes);
				break;
			case 2:
				personas[i] = new Profesor(nombre, apellido, edad);
				break;
			case 3:
				int numObras = Random.obtener(0, 500);
				personas[i] = new Arquitecto(nombre, apellido, edad, numObras);
				break;
			case 4:
				personas[i] = new Programador(nombre, apellido, edad);
				break;
			}
			personas[i].saludar();
			personas[i].identificarse();

			if (personas[i] instanceof Programador) {
				metodo[0] = Programador.desarrollarSistema();
				metodo[1] = Programador.desarrollarVideojuego();
				int num2 = Random.obtener(0, 2);
				System.out.println(metodo[num2]);
			} else if (personas[i] instanceof Medico) {
				metodo[0] = Medico.tratarPaciente();
				metodo[1] = Medico.hacerInvestigacion();
				int num2 = Random.obtener(0, 2);
				System.out.println(metodo[num2]);
			} else if (personas[i] instanceof Profesor) {
				metodo[0] = Profesor.enseniarHistoria();
				metodo[1] = Profesor.enseniarMatematicas();
				int num2 = Random.obtener(0, 2);
				System.out.println(metodo[num2]);
			} else if (personas[i] instanceof Arquitecto) {
				metodo[0] = Arquitecto.diseniarEdificio();
				metodo[1] = Arquitecto.diseniarPuente();
				int num2 = Random.obtener(0, 2);
				System.out.println(metodo[num2]);
			}
			personas[i].despedirse();
			System.out.println("--------------");
		}

	}

}
