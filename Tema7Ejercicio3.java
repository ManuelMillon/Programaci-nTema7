/**
 * 
 */
package tema7;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema7Ejercicio3 {

	/**
	 * Escribe un programa que lea 10 n�meros por teclado y que luego los muestre
	 * en orden inverso, es decir, el primero que se introduce es el �ltimo en mostrarse
	 * y viceversa.

	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int [] n = new int [10];
		int i;
		
		System.out.println("Introduce 10 n�meros enteros y luego ENTER: ");
		
		for (i = 0; i < 10; i++) {
			n[i] = kboard.nextInt();
			}
		System.out.println("Los n�meros introducidos, al rev�s, son los siguientes: ");
		for (i = 9; i >= 0; i--) {
			System.out.println(n[i]);
		}
	
	}

}
