/**
 * 
 */
package tema7;

/**
 * @author Usuario
 *
 */
public class Tema7Chapuzas2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String ALUMNOS[] = {
				"Andr�s", 
				"Jairo", 
				"Ander", 
				"Adri�n", 
				"Jos� Manuel", 
				"Daniel Fabi�n", 
				"Daniel", 
				"Sergio", 
				"Jes�s Mar�a", 
				"Santos", 
				"Cru", 
				"Noel", 
				"YO", 
				"Marcos",
				"Javier",
				"Adri�n",
				"Pablo Jes�s",
				"Gonzalo",
				"Fernando",
				"Francisco",
				
				
		};
		
		System.out.println("El afortunado es ");
		for (int i = 1; i <= 7; i++) {
			System.out.print(".");
		}
		
		Thread.sleep(2000);
		System.out.println(ALUMNOS[(int)(Math.random() * ALUMNOS.length)] + "\"");
	}

}
