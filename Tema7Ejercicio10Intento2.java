/**
 * 
 */
package repositorioTema7;

import java.util.Iterator;

/**
 * @author manol
 *
 */
public class Tema7Ejercicio10Intento2 {

	/**
	 * Tema 7 Ejercicio 10. Escribe un programa que genere 20 números enteros
	 * aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser
	 * capaz de pasar todos los números pares a las primeras posiciones del array
	 * (del 0 en adelante) y todos los números impares a las celdas restantes.
	 * Utiliza arrays auxiliares si es necesario.
	 */

	public static void main(String[] args) {
		int[] numeros = new int[20];
		int[] Pares = new int[20];
		int[] Impares = new int[20];
		int cuentaPares = 0;
		int cuentaImpares = 0;
		int i;
		
		for (i = 0; i < 20; i++) {
			numeros[i] = ((int) (Math.random() * 101));
			System.out.print(numeros[i] + " ");

			if (numeros[i] % 2 == 0) {
				Pares[cuentaPares++] = numeros[i];
			} else {
				Impares[cuentaImpares++] = numeros[i];
			}
		}
		
		System.out.println();
		
		for (i = 0; i < cuentaPares; i++) {
				numeros[i] = Pares[i];
			}
		
		for (i = cuentaPares; i < 20; i++) {
				numeros[i] = Impares[i - cuentaPares];
			}

		System.out.println("Array con los pares de inicio: ");
		
		for (i= 0; i < 20; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
