/**
 * 
 */
package tema7;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema7ExplicacionesYPruebas {

	/**
	 * Experiementos
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		int [] n;
		n = new int [4];
		n[0] = 26;
		n[1] = -30;
		n[2] = 0;
		n[3] = 100;
		
		System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
		
		int [] x = new int[5];
		x[0] = 8;
		x[1] = 33;
		x[2] = 200;
		x[3] = 150;
		x[4] = 150;
		System.out.print("¿Qué número, del 1 al 4, quieres ver? ");
		int indice = Integer.parseInt(kboard.nextLine());
		System.out.println("En la posición " + indice + " está el elemento " + x[indice]);
		
		int [] y = {3, 52, 62, 689, 43};

		System.out.print("¿Qué número, del 1 al 4, quieres ver ahora? ");
		int indicador = Integer.parseInt(kboard.nextLine());
		System.out.println("En la posición " + indicador + " está el elemento " + y[indicador]);
		
		
	}

}
