package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio6_Main {

	public static void main(String[] args) {

		int n = 0;
		
		// Comprueba que el numero introducido sea valido y superior a 0
		do {
			
			String stringn = JOptionPane.showInputDialog("Introduce un numero entero positivo.");
			n = Integer.parseInt(stringn);

			if (n <= 0) {
				JOptionPane.showMessageDialog(null, "Por favor, introduce un numero positivo");
			}

		} while (n <= 0);
		
		// Calcula y luego muestra la longitud del digito introducido
		int longitud = longitudNumero(n);
		
		// Separo singular de plural
		if (longitud < 2) {
			JOptionPane.showMessageDialog(null,"El numero " + n + " tiene " + longitud + " digito de longitud.");
		} else {
			JOptionPane.showMessageDialog(null,"El numero " + n + " tiene " + longitud + " digitos de longitud.");
		}

	}
	
	// Funcion que calcula el numero de digitos que tiene un numero
	public static int longitudNumero(int n) {
		
		String aString = String.valueOf(n);
		int longitud = aString.length();
		return longitud;
		
	}

}
