package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio8_Main {

	public static void main(String[] args) {

		// Creada array
		int[] numArray = new int[10];

		// Ejecuto funcion para rellenar array, y luego mostrar por consola
		numArray = rellenarNumeros(numArray);
		mostrarNumeros(numArray);

	}

	// Funcion que rellena la arra
	public static int[] rellenarNumeros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			String num = JOptionPane.showInputDialog("Introduce un numero sin decimales.");
			int numInt = Integer.parseInt(num);
			array[i] = numInt;
		}

		return array;

	}

	// Funcion que muestra los numeros introducidos
	public static void mostrarNumeros(int[] array) {
		
		System.out.println("Numeros introducidos en el array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
