/**
 * 
 */
package tema7;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema7Ejercicio9 {

	/**
	 * Realiza un programa que pida 8 números enteros y que luego muestre esos
	 * números junto con la palabra “par” o “impar” según proceda.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[8];
		int i;
		System.out.print("Intruduce 8 números enteros para ver si son par o impar: ");
		for (i = 0; i < numero.length; i++) {
			numero[i] = sc.nextInt();
		}
		for (i = 0; i < numero.length; i++) {

			if (numero[i] % 2 == 0) {
				System.out.println(numero[i] + " es par.");
			} else {
				System.out.println(numero[i] + " es impar.");
			}
		}

	}

}
