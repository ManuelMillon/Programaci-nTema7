/**
 * 
 */
package tema7;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema7Ejercicio5 {

	/**
	 * Escribe un programa que pida 10 números por teclado y que luego muestre los
	 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
	 * máximo y del mínimo respectivamente.
	 */

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		int[] numero = new int[10];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int i;

		System.out.println("Mete números enteros y pulsando INTRO:");

		for (i = 0; i < 10; i++) {
			numero[i] = kboard.nextInt();

			if (numero[i] < minimo) {
				minimo = numero[i];
			}
			if (numero[i] > maximo) {
				maximo = numero[i];
			}
		}

		System.out.println();
		for (i = 0; i < 10; i++) {
			System.out.print(numero[i]);
			if (numero[i] == maximo) {
				System.out.print(" Número máximo");
			}

			if (numero[i] == minimo) {
				System.out.print(" Número mínimo");
			}
			System.out.println();
		}
	}

}
