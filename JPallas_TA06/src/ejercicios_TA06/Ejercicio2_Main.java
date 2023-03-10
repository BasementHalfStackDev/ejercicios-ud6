package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio2_Main {

	public static void main(String[] args) {
		
		// Pide al usuario la cantidad de numeros a generar
		String stringn = JOptionPane.showInputDialog("Introduce la cantidad de numeros a generar.");
		int n = Integer.parseInt(stringn);

		// Comprueba que la cantidad sea superior a 0
		if (n < 1) {
			JOptionPane.showMessageDialog(null, "Error, la cantidad de numeros a generar no puede ser inferior a 1");
			System.exit(1);
		}

		// Pide el valor minimo y maximo del rango a generar
		String stringMin = JOptionPane.showInputDialog("Valor minimo de los numeros a generar.");
		String stringMax = JOptionPane.showInputDialog("Valor maximo de los numeros a generar.");

		int min = Integer.parseInt(stringMin);
		int max = Integer.parseInt(stringMax);

		// Comprueba que el minimo y maximo sean diferentes, con el minimo inferior al maximo
		if (max < min) {
			JOptionPane.showMessageDialog(null, "Error, El rango minimo no puede ser mayor al maximo");
			System.exit(2);
		} else if (max == min) {
			JOptionPane.showMessageDialog(null, "Error, el valor maximo y minimo son iguales");
			System.exit(3);
		}

		// Crea array donde se almacenaran los numeros
		int rango[] = new int[n];
		System.out.println("Los numeros generados son los siguientes:");

		// Llama a la funcion hasta llegar al final del array, mostrando los numeros generados
		for (int i = 0; i < n; i++) {
			rango[i] = generadorInt(min, max);
			System.out.println(rango[i]);
		}

	}

	// Funcion que genera un numero aleatorio dentro del rango especificado
	public static int generadorInt(int valorMin, int valorMax) {
		int rango = valorMax - valorMin;
		int num = (int) ((Math.random() * (rango + 1)) + valorMin);
		return num;
	}

}
