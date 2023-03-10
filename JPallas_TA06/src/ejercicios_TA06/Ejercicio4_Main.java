package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio4_Main {

	public static void main(String[] args) {

		int n = 0;

		// Pide al usuario un numero a comprobar, repitiendo si el numero no es valido

		do {
			String stringn = JOptionPane.showInputDialog("Introduce un numero.");
			n = Integer.parseInt(stringn);

			if (n <= 1) {
				JOptionPane.showMessageDialog(null, "Por favor, introduce un numero positivo mayor de 1");
			}

		} while (n <= 1);

		int factorial = calcFactorial(n);

		// Muestra el resultado
		
		JOptionPane.showMessageDialog(null, "El factorial de " + n + " es " + factorial + ".");

	}

	// Funcion que calcula el factorial
	
	public static int calcFactorial(int num) {

		int i = num - 1;

		while (i > 1) {
			num = num * i;
			i--;
		}

		return num;

	}

}
