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
	 * Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
	 * n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
	 * m�ximo y del m�nimo respectivamente.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int numero = 10;
		
		int[] numeroIntroducido = new int[10];
		
		int i = 0;
		
		do {
			System.out.print("Introduzca " + numero + " n�meros: ");
			numeroIntroducido [i] = Integer.parseInt(kboard.nextLine()); 

			
			i++;
			numero--;

		} while (numero > 0);
		
	}

}
