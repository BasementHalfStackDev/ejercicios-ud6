package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio7_Main {

	public static void main(String[] args) {

		// Creadas variables de divisas permitidas, divisa a elegir, comprovador y
		// cantidad
		String[] divisas = { "dolar", "libra", "yen" };
		String divisaElegida = "";
		int comprovador = 0;
		double cantidad = 0;

		// Pregunta el usuario por la divisa a elegir hasta que sea correcta
		do {
			divisaElegida = JOptionPane.showInputDialog("Introduce la divisa a convertir. Dolar, libra o yen.");
			divisaElegida = divisaElegida.toLowerCase();
			comprovador = 0;

			for (int i = 0; i < divisas.length; i++) {
				if (divisaElegida.equals(divisas[i])) {
					comprovador++;
				}
			}

			if (comprovador != 1) {
				JOptionPane.showMessageDialog(null, "Error, la divisa introducida no es valida.");
			}

		} while (comprovador != 1);

		
		// Pregunta por la cantidad a convertir hasta que sea correcta
		do {
			cantidad = 0;
			String inputCantidad = JOptionPane.showInputDialog(
					"Introduce la cantidad de euros a convertir a " + divisaElegida + ".");
			cantidad = Double.parseDouble(inputCantidad);

			if (cantidad <= 0) {
				JOptionPane.showMessageDialog(null, "Error, tienes que introducir una cantidad positiva.");
			}

		} while (cantidad <= 0);
		
		// Ejecuta metodo conversor
		conversorDivisas(cantidad, divisaElegida);

	}

	// Funcion que convierte y muestra por pantalla la cantidad de euros pasada por parametro a la divisa indicada
	public static void conversorDivisas(double eur, String divisa) {
		switch (divisa) {
		case "dolar":
			double conversionDol = eur * 1.28611;
			JOptionPane.showMessageDialog(null, eur + " Convertidos, son " + conversionDol + " Dolares.");
			break;
		case "libra":
			double conversionLib = eur * 0.86;
			JOptionPane.showMessageDialog(null, eur + " Convertidos, son " + conversionLib + " Libras.");
			break;
		case "yen":
			double conversionYen = eur * 129.854;
			JOptionPane.showMessageDialog(null, eur + " Convertidos, son " + conversionYen + " Yen.");
			break;
		}

	}

}
