package dpWithDurgesh.singletonPattern;

public class Jalebi {

	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
}

/* This is an EAGER initialization of Singleton object
 * 
 * Advantage 
 * 	1. loads instance as soon as class loads
 * 	2. Thread safe
 * 
 * Disadvantage
 * 	1. If client dosn't need, waste of MEMORY >>> Not good for big project
 * 		>> preformnce can be impacted
 */
