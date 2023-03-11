package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio10_Main {

	public static void main(String[] args) {

		int l = 0;

		// Pide longitud del array al usuario y comprueba que sea correcta
		do {
			String lstring = JOptionPane.showInputDialog("Introduce la longitud del array a generar");
			l = Integer.parseInt(lstring);

			if (l < 1) {
				JOptionPane.showMessageDialog(null,
						"Por favor, introduce un numero positivo mayor de 0 y sin decimales.");
			}

		} while (l < 1);

		// Crea el array con la longitud especificada
		int[] array = new int[l];

		// Rellena el array con numeros primos
		array = rellenadorPrimos(array);

		// Muestra el contenido final
		muestraArray(array);

	}

	// Funcion que rellena arrays con numeros primos
	public static int[] rellenadorPrimos(int[] array) {

		int min = 0;
		int max = 0;

		do {
			String smin = JOptionPane.showInputDialog("Introduce el rango minimo de numeros a generar");
			min = Integer.parseInt(smin);
			String smax = JOptionPane.showInputDialog("Introduce el rango maximo de numeros a generar");
			max = Integer.parseInt(smax);
			if (min >= max) {
				JOptionPane.showMessageDialog(null, "El rango minimo no puede ser mayor o igual al maximo");
			}
		} while (min >= max);

		int rango = max - min;

		for (int i = 0; i < array.length; i++) {
			do {
				array[i] = (int) ((Math.random() * (rango + 1)) + min);
			} while (!esPrimo(array[i]));
		}
		return array;
	}

	// Funcion comprobadora de numeros primos
	public static boolean esPrimo(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Funcion para mostrar contenidos del array
	public static void muestraArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
