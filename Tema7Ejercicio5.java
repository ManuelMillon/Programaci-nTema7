/**
 * 
 */
package tema7;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema7Ejercicio5 {

	/**
	 * Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
	 * n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
	 * m�ximo y del m�nimo respectivamente.
	 */

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		int[] numero = new int[10];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int i;

		System.out.println("Mete n�meros enteros y pulsando INTRO:");

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
				System.out.print(" N�mero m�ximo");
			}

			if (numero[i] == minimo) {
				System.out.print(" N�mero m�nimo");
			}
			System.out.println();
		}
	}

}
