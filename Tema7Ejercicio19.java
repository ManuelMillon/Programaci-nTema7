/**
 * 
 */
package repositorioTema7;

import java.util.Scanner;

/**
 * @author manol
 * 
 *
 */
public class Tema7Ejercicio19 {

	/**
	 * Ejercicio 19. Realiza un programa que sea capaz de insertar un número en una
	 * posición concreta de un array. En primer lugar, el programa generará un array
	 * de 12 números enteros aleatorios entre 0 y 200 ambos incluidos. A
	 * continuación se debe mostrar el contenido de ese array junto al índice (0 –
	 * 11). Seguidamente el programa preguntará por el número que se quiere insertar
	 * y por la posición donde será insertado. Los números del array se desplazan a
	 * la derecha para dejar sitio al nuevo. El último número (el que se encuentra
	 * en la posición 11) siempre se perderá.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		;
		int[] numero = new int[12];
		for (int i = 0; i < 12; i++) {
			numero[i] = (int) (Math.random() * 201);

		}
		System.out.println("Array original:");
		System.out.print("\nÍndice ");
		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", i);
		}

		System.out.print("\nValor:  ");
		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", numero[i]);
		}
		System.out.println();
		
		
		System.out.println("Por favor, introduzca la posición que quiera introducir, del 0 a al 11: ");
		int posicionCambiada = Integer.parseInt(sc.nextLine());
		System.out.println("Por favor, introduzca el número a cambiar, del 1 al 200: ");
		int numeroCambiado = Integer.parseInt(sc.nextLine());

		//SUSTITUIR UN NÚMNERO POR OTRO Y PASAR DE POSICIÓN EL RESTO A LA DERECHA, DESAPARECIENDO EL ÚLTIMO.
		
		for (int i = 11; i > posicionCambiada; i--) {
			numero[i] = numero[i - 1];
			}
		numero[posicionCambiada] = numeroCambiado;

		System.out.println("\nNuevo Array:");

		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", i);
		}
		System.out.println("\nValor ");
		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", numero[i]);
		}
	}
}
