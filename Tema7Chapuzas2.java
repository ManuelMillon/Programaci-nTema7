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
				"Andrés", 
				"Jairo", 
				"Ander", 
				"Adrián", 
				"José Manuel", 
				"Daniel Fabián", 
				"Daniel", 
				"Sergio", 
				"Jesús María", 
				"Santos", 
				"Cru", 
				"Noel", 
				"YO", 
				"Marcos",
				"Javier",
				"Adrián",
				"Pablo Jesús",
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
