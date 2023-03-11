package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio12_Main {

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

		// Rellena el array con numeros del 1 al 300
		array = rellenadorArray(array);

		// Muestra los numeros con numero final especificado
		muestraArray(array);

	}

	// Funcion que rellena arrays con numeros aleatorios del 1 al 300
	public static int[] rellenadorArray(int[] array) {
		int min = 1;
		int max = 300;
		int rango = max - min;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * (rango + 1)) + min);
		}
		return array;
	}

	// Funcion para mostrar contenidos del array finalizados en el numero
	// determinado
	public static void muestraArray(int[] array) {

		int num = 10;
		do {
			String numstring = JOptionPane.showInputDialog("Introduce el digito final");
			num = Integer.parseInt(numstring);
			if (num > 9 || num < 0) {
				JOptionPane.showMessageDialog(null, "Error, el numero tiene que ser entre 0 y 9");
			}
		} while (num > 9 || num < 0);

		System.out.println("Estos son los numeros generados que terminan en " + num);

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == num) {
				System.out.println(array[i]);
			}
		}
	}

}
