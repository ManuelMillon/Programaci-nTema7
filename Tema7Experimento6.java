/**
 * 
 */
package tema7;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema7Experimento6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
		System.out.println("Generador aleatorio de banderas");
		
		System.out.print("¿Cuántas franjas quiere para la bandera? ");
		int franjas = s.nextInt();
		System.out.println("--------------");
		for (int i = 0; i < franjas; i++) {
		System.out.println(color[(int)(Math.random() * 6)]);
		System.out.println("--------------");
		}
		
		String[] diaSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
		System.out.println("Me toca estudiar el ");
		System.out.println(diaSemana[(int)(Math.random() * 7)]);

		
	}

}
