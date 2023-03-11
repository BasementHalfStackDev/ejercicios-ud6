package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio9_Main {

	public static void main(String[] args) {

		int l = 0;

		// Pide longitud al usuario y comprueba que sea correcta
		do {
			String lstring = JOptionPane.showInputDialog("Introduce la longitud del array a generar");
			l = Integer.parseInt(lstring);

			if (l < 1) {
				JOptionPane.showMessageDialog(null,
						"Por favor, introduce un numero positivo mayor de 0 y sin decimales.");
			}

		} while (l < 1);

		// Crea el array con la longitud especificada
		// Y la rellena y muestra con las funciones creadas
		int[] array = new int[l];

		array = rellenadorArray(array);

		muestraYSumaArray(array);

	}

	// Funcion que rellena arrays con numeros aleatorios del 0 al 9
	public static int[] rellenadorArray(int[] array) {
		int min = 0;
		int max = 9;
		int rango = max - min;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * (rango + 1)) + min);
		}

		return array;

	}

	// Funcion que muestra el contenido del array junto a la suma de todos los
	// numeros
	public static void muestraYSumaArray(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			total = total + array[i];
		}
		System.out.println("La suma de todos los numeros es de: " + total);
	}

}
