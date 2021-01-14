/**
 * 
 */
package tema7;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema7Chapuzas {

	/**
	 * Escribe un programa que pida 10 números por teclado y que luego muestre los
	 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
	 * máximo y del mínimo respectivamente.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int numero = 10;
		
		int[] numeroIntroducido = new int[10];
		
		int i = 0;
		
		do {
			System.out.print("Introduzca " + numero + " números: ");
			numeroIntroducido [i] = Integer.parseInt(kboard.nextLine()); 

			
			i++;
			numero--;

		} while (numero > 0);
		
	}

}
