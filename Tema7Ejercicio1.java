/**
 * 
 */
package tema7;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema7Ejercicio1 {
	

	/**
	 * Define un array de 12 números enteros con nombre num y asigna los valores
	 * según la tabla que se muestra a continuación. Muestra el contenido de todos
	 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
	 * han sido inicializados?
	 */
	public static void main(String[] args) {
		int [] x = new int[5];
		x[0] = 39;
		x[1] = -2;
		x[2] = 0;
		x[3] = 0;
		x[4] = 0;
		x[5] = 0;
		x[6] = 14;
		x[7] = 0;
		x[8] = 0;
		x[9] = 0;
		x[10] = 0;
		x[11] = 0;

		
		System.out.println(x[0] + ", " + x[1] + ", " + x[2] + ", " + x[3]);
		System.out.println(x[4] + ", " + x[5] + ", " + x[6] + ", " + x[7]);
		System.out.println(x[8] + ", " + x[9] + ", " + x[10] + ", " + x[11]);
		
		/**
		 * Eclipse te fuerza a iniciar las variables, aunque sea con un cero.
		 * Pero luego es incapaz de imprimir nada.
		 */
		
		
		
		
	}

}
