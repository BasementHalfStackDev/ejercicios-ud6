package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio5_Main {

	public static void main(String[] args) {

		int n = 0;

		// Pide al usuario un numero a comprobar, repitiendo si el numero no es valido
		do {
			String stringn = JOptionPane.showInputDialog("Introduce un numero.");
			n = Integer.parseInt(stringn);

			if (n < 0) {
				JOptionPane.showMessageDialog(null, "Por favor, introduce un numero positivo");
			}

		} while (n < 0);

		// Ejecuta funcion
		String nBinario = convertiraBinario(n);

		// Muestra el resultado
		JOptionPane.showMessageDialog(null, n + " en binario es "+nBinario);

	}

	// Funcion que transforma el numero decimal a binario
	public static String convertiraBinario(int n) {
		String binario = "";

		if (n == 0) {
			binario = "0";
		}

		while (n > 0) {
			int resto = n % 2;
			binario = resto + binario;
			n = n / 2;
		}

		return binario;
	}
}
