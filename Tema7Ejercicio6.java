/**
 * 
 */
package tema7;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema7Ejercicio6 {

	/**
	 * Escribe un programa que lea 15 n�meros por teclado y que los almacene en un
	 * array. Rota los elementos de ese array, es decir, el elemento de la posici�n
	 * 0 debe pasar a la posici�n 1, el de la 1 a la 2, etc. El n�mero que se
	 * encuentra en la �ltima posici�n debe pasar a la posici�n 0. Finalmente,
	 * muestra el contenido del array.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		int[] numeroIntroducido = new int[4];
		System.out.println("Introduce 4 n�meros para recolocarlos: ");

		for (int i = 0; i <=3; i++) {
			numeroIntroducido[i] = Integer.parseInt(kboard.nextLine());
			System.out.println();
			int ultimo = numeroIntroducido[3];
			numeroIntroducido[3] = numeroIntroducido[0];
			numeroIntroducido[2] = numeroIntroducido[3];
			numeroIntroducido[1] = numeroIntroducido[2];
			numeroIntroducido[0] = numeroIntroducido[1];
			
		}
		
		System.out.println(numeroIntroducido[0] + " " + numeroIntroducido[1] + " " + numeroIntroducido[2] + " " + numeroIntroducido[3]);

	}
}
