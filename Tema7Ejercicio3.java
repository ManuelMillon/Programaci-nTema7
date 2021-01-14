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
	 * Escribe un programa que lea 10 números por teclado y que luego los muestre
	 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
	 * y viceversa.

	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int [] n = new int [10];
		int i;
		
		System.out.println("Introduce 10 números enteros y luego ENTER: ");
		
		for (i = 0; i < 10; i++) {
			n[i] = kboard.nextInt();
			}
		System.out.println("Los números introducidos, al revés, son los siguientes: ");
		for (i = 9; i >= 0; i--) {
			System.out.println(n[i]);
		}
	
	}

}
