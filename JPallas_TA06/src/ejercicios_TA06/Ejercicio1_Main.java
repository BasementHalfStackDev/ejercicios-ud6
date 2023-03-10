package ejercicios_TA06;

import javax.swing.JOptionPane;

public class Ejercicio1_Main {

	public static void main(String[] args) {

		// Creo string con las opciones a seleccionar
		String[] opciones = { "Circulo", "Triangulo", "Cuadrado", "Cancelar" };

		// Pregunto al usuario por el tipo de objeto a calcular
		int respuesta = JOptionPane.showOptionDialog(null, "El area de que figura quieres calcular?",
				"Calculadora de area", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones,
				opciones[0]);

		// Segun la respuesta, ejecuta la funcion calculadora con una opcion u otra
		if (respuesta == 0) {
			double areaCirculo = calculadorArea(0);
			JOptionPane.showMessageDialog(null, "El area del circulo es de " + areaCirculo);
		} else if (respuesta == 1) {
			double areaTriangulo = calculadorArea(1);
			JOptionPane.showMessageDialog(null, "El area del Triangulo es de " + areaTriangulo);
		} else if (respuesta == 2) {
			double areaCuadrado = calculadorArea(2);
			JOptionPane.showMessageDialog(null, "El area del cuadrado es de " + areaCuadrado);
		}

	}

	// Funcion calculadora de area, segun la opcion pasada por parametro
	public static double calculadorArea(int opcion) {

		if (opcion == 0) {
			String radioCirculo = JOptionPane.showInputDialog("Introduce el radio del circulo");
			double radio = Double.parseDouble(radioCirculo);
			double areafinalA = Math.pow(radio, 2) * 3.14;
			return areafinalA;
		} else if (opcion == 1) {
			String baseTriangulo = JOptionPane.showInputDialog("Introduce la base del triangulo");
			String alturaTriangulo = JOptionPane.showInputDialog("Y su altura");
			double base = Double.parseDouble(baseTriangulo);
			double altura = Double.parseDouble(alturaTriangulo);
			double areafinalB = (base * altura) / 2;
			return areafinalB;
		} else if (opcion == 2) {
			String ladoCuadrado = JOptionPane.showInputDialog("Introduce cuanto mide uno de los lados del cuadrado");
			double lado = Double.parseDouble(ladoCuadrado);
			double areafinalC = Math.pow(lado, 2);
			return areafinalC;
		} else {
			return 1;
		}

	}

}
