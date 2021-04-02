/**
 * 
 */
package repositorioTema7;

/**
 * @author manol
 *
 */
public class Tema7Ejercicio21 {

	/**
	 * Escribe un programa que rellene un array de 15 elementos con números enteros
	 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
	 * array “cincuerizado”, según el siguiente criterio: si el número que hay en una
	 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
	 * siguiente múltiplo de 5 que exista a partir de él.
	 * 
	 * Ejemplo:
	 * Array original:
	 * 459 204 20 250 178 90 353 35 229 357 224 454 260 310 140
	 * Array cincuerizado:
	 * 460 205 20 250 180 90 355 35 230 360 225 455 260 310 140
	 */
	public static void main(String[] args) {
		int [] n = new int [15];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 501);
		}
		System.out.println("Conjunto original de valores: ");
		
		for (int i = 0; i < 15; i++) {
			System.out.print(n[i] + " ");	
		}
		
		for (int i = 0; i < 15; i++) {
		while (n[i] %5 != 0) {
			n[i]++;				//Suma 1 hasta el siguiente múltiplo de 5, quedando cada n[i] modificado. 
		}
		}
	System.out.println();
		System.out.print("Array resultado: "); 
		for (int i = 0; i < 15; i++) {
			System.out.print(n[i] + " ");
		}
		

	}

}
