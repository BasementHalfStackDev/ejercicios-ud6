package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio11_Main {

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
		int[] array1 = new int[l];

		// Rellena array
		array1 = rellenadorArray(array1);

		// Crea array 2 con referencia al array 1
		int[] array2 = array1;

		// Genera numeros aleatorios al array 2
		array2 = rellenadorArray(array2);

		// Multiplica valores del array 1 con el array 2
		int[] arrayfinal = multiplicadorValores(array1, array2);

		// Muestra resultados
		muestraValores("Contenido del primer array", array1);
		muestraValores("Contenido del segundo array", array2);
		muestraValores("Resultado de las multiplicaciones entre arrays", arrayfinal);

		// Ambas arrays contienen los mismos numeros. Al ser creada por referencia, sus
		// valores estan ligados entre ellas

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

	public static int[] multiplicadorValores(int[] array1, int[] array2) {

		int[] arrayfinal = new int[array1.length];

		for (int i = 0; i < arrayfinal.length; i++) {
			arrayfinal[i] = array1[i] * array2[i];
		}
		return arrayfinal;
	}

	public static void muestraValores(String titulo, int[] array) {

		System.out.println(titulo);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + i + ": " + array[i]);
		}

		return;
	}
}
