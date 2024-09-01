package dpWithDurgesh.singletonPattern;

import java.io.Serializable;

/* 
 * Creational DP
 * 
 * Singleton DP allows us to undtrstand 
 * how can we create single instance of a class 
 * for whole application
 * 
 * That is whenever an instance is needed for that class 
 * same object will be returned
 * 
 * Usecase - JDBC connection object creation
 */
public class Samosa implements Serializable, Cloneable{
	
//	INSTANCE >> make class enum to use
	
	private static Samosa samosa;
	
//	Constructor will be private
//	This will help us restricting multiple object creation
	private Samosa() {
//		if(samosa!=null) {
//			throw new RuntimeException("You're trying to break singleton Pattern");
//		}
	}
	
	// lazy way of object initialization
	// not thread safe
//	public static Samosa getSamosa() {
//		// object of this class
//		if(samosa==null) {
//			samosa= new Samosa();
//		}
//		return samosa;
//		
//	}
	
	// thread Safe 
	// >> synchronized helps us restirct number of thread that uses this method to 1
	// >> better use synchronize block than making method synchronized
	public static Samosa getSamosa() {
		
		// object of this class
		if(samosa==null) {
			
			synchronized(Samosa.class) {
				if(samosa==null) {
					samosa= new Samosa();
				}
			}
		}
		return samosa;
		
	}
	
	public Object readResolve() {
		return samosa;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
		return samosa;
	}

}
/*
 *	1. Constrcutor private
 *
 *	2. create object with help of method
 *
 *  3. make field private that store object
 *  
 *  	Till here, we've done lazy initialization for object creation.
 *  	
 *  Advanntage
 *  1. Object created only when method is callled >> no memory issue
 *  
 *  Disadvantage
 *  1. Multiple Thread are not considered while lazy initialization >>> Not Thread Safe 
 *  	>> can create multiple object
 *  	
 *  	Solution - use synchronize block
 *  
 */
