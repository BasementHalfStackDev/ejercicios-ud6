package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio3_Main {

	public static void main(String[] args) {

		int n = 0;

		// Pide al usuario un numero a comprobar, repitiendo si el numero no es valido

		do {
			String stringn = JOptionPane.showInputDialog("Introduce un numero.");
			n = Integer.parseInt(stringn);

			if (n <= 0) {
				JOptionPane.showMessageDialog(null, "Por favor, introduce un numero positivo mayor de 0");
			}

		} while (n <= 0);

		boolean primoCheck = esPrimo(n);

		// Muestra si es primo o no, dependiendo de si la funcion devuelve true o false
		
		if (primoCheck) {
			JOptionPane.showMessageDialog(null, "El numero " + n + " es primo");
		} else {
			JOptionPane.showMessageDialog(null, "El numero " + n + " no es primo");
		}

	}

	// Funcion que comprueba si el numero introducido es primo
	
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

}
