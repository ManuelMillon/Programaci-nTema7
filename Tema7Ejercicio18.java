/**
 * 
 */
package repositorioTema7;

/**
 * @author manol
 *
 */
public class Tema7Ejercicio18 {

	/**
	 * Ejercicio 18 Realiza un programa que genere 10 números enteros aleatorios
	 * entre 0 y 200 ambos incluidos y que los almacene en un array. A continuación,
	 * el programa debe mostrar el contenido de ese array junto al índice (0 – 9).
	 * Seguidamente el programa debe colocar de forma alterna y en orden los menores
	 * o iguales de 100 y los mayores de 100: primero menor, luego mayor, luego
	 * menor, luego mayor… Cuando se acaben los menores o los mayores, se completará
	 * con los números que queden.
	 */
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int[] numerosGrandes = new int[10];
		int[] numerosPequenos = new int[10];
		int numeroGrande = 0;
		int numeroPequeno = 0;

		for (int i = 0; i < 10; i++) {
			numeros[i] = (int) (Math.random() * 201);
			if (numeros[i] <= 100) {
				numerosPequenos[numeroPequeno++] = numeros[i];
			} else {
				numerosGrandes[numeroGrande++] = numeros[i];
			}

		}

		System.out.print("\nÍndice: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d ", i);
		}

		System.out.print("\nValor:  ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d ", numeros[i]);
		}
		System.out.println();

		int[] ordenacion = new int[10];
		int numeroMenor = 0;
		int numeroMayor = 0;
		int j = 0;
		do {
			if (numeroMayor < numeroGrande) {
				ordenacion[j++] = numerosGrandes[numeroGrande++];
			}
			if (numeroMenor < numeroPequeno) {
				ordenacion[j++] = numerosPequenos[numeroPequeno++];
			}

		} while (j < 10);

		System.out.print("\nÍndice:    ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d ", i);
		}
		System.out.print("\nResultado: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d ", ordenacion[i]);
		}

	}

}
