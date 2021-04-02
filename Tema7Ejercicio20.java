/**
 * 
 */
package repositorioTema7;

import java.util.Scanner;

/**
 * @author manol
 *
 */
public class Tema7Ejercicio20 {

	/**
	 * Implementa un programa que calcule la denominación ordinal de los reyes de
	 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
	 * van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
	 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
	 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
	 * aparecer como Felipe 1º y el segundo como Felipe 2º.
	 */
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce el número de reyes: ");

		int n = Integer.parseInt(s.nextLine());

		String[] reyes = new String[n];

		System.out.println("Introduce los nombres de los reyes y pulsa INTRO: ");
		for (int i = 0; i < n; i++) {
			reyes[i] = s.nextLine();
		}

		for (int i = 0; i < n; i++) {
			int orden = 1;

			for (int j = 0; j < i; j++) {
				if (reyes[i].equals(reyes[j])) {
					orden++;
				}
			}
			System.out.println(reyes[i] + " " + orden + "º");

		}
	}

}
