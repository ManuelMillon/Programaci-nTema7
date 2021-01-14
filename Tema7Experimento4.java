/**
 * 
 */
package tema7;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema7Experimento4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		double[] nota = new double[4];
		
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus exámenes.");
		
		System.out.print("Introduce el número de examenes: ");
		int numeroExamenes = kboard.nextInt();
		
		double suma = 0;
		
		for (int i= 0; i < numeroExamenes; i++) {
			System.out.print("Nota del examen nº " + (i + 1) + ": ");
			nota[i] = kboard.nextDouble();
			suma += nota[i];
		}
			for (double notas : nota) {
				System.out.println("Tus notas son: ");
			}
		}

		System.out.println("La media es " + suma / 4);
	}

}
