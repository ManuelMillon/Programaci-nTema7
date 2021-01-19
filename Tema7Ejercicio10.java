/**
 * 
 */
package tema7;

/**
 * @author Usuario
 *
 */
public class Tema7Ejercicio10 {

	/**
	 * Tema 7 Ejercicio 10. AÚN NO FUNCIONA.
	 */
	public static void main(String[] args) {
		int[] numeros = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		int cuentaPares = 0;
		int cuentaImpares = 0;

		for (int i = 0; i < 20; i++) {
			numeros[i] = (int) (Math.random() * 101);

			for (i = 0; i < 20; i++) {
				if (numeros[i] % 2 == 0) {
					pares[cuentaPares] = numeros[i];
					cuentaPares++;
				} else {
					impares[cuentaImpares] = numeros[i];
					cuentaImpares++;
				}
			}
			for (i = 0; i <= numeros [i]; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
			
			for (i = 0; i < cuentaPares; i++)  {
				System.out.print(i + " ");
			}
			System.out.print("");
			
			for (i = 0; i <= cuentaImpares; i++)  {
				System.out.print(i + " ");
			}
			
		}

	}

}
