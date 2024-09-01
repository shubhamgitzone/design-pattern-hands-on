package dpWithDurgesh.singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

	public static void main(String[] args) throws Exception{

//		Samosa s1 = Samosa.getSamosa();
//		System.out.println(s1.hashCode());
//		Samosa s2 = Samosa.getSamosa();
//		System.out.println(s2.hashCode());
//
//		Jalebi j1 = Jalebi.getJalebi();
//		System.out.println(j1.hashCode());
//		Jalebi j2 = Jalebi.getJalebi();
//		System.out.println(j2.hashCode());

		/*
		 * Breaking Singleton Pattern
		 * 
		 * 1. Reflection API can be used to break singleton pattern
		 * 		
		 * 		Solution - 
		 * 			1. If Object exists >>> throw exception from inside constructor
		 * 			2. use Enum
		 * 
		 * 2. Serialization and Deserialization 
		 * 		------ class must should have implemented SERIALIZEABLE interface
		 * 		Soltuion -
		 * 			1.  implementing readResolve method
		 * 
		 * 3. Cloning
		 * 		------ class must should have implemented SERIALIZEABLE interface
		 * 		Solution -
		 * 			1. override clone method to return same object
		 * 
		 */
		
		// BREAKING SINGLETON USING REFLECTION API
//		Samosa s1 = Samosa.getSamosa();
//		System.out.println(s1.hashCode());
//		
//		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Samosa s2 = constructor.newInstance();
//		System.out.println(s2.hashCode());
		
		// USING ENUM to DEFINE SINGLETON PATTERN
//		Samosa s1= Samosa.INSTANCE;
//		System.out.println(s1.hashCode());
//		Samosa s2 = Samosa.INSTANCE;
//		System.out.println(s2.hashCode());
		
		 // BREAKING SINGLETON USING Serialization and Deserialization
//		Samosa samosa = Samosa.getSamosa();
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//		oos.writeObject(samosa);
//		System.out.println(samosa.hashCode());
//		System.out.println("Serialization done....");
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//		Samosa s2 = (Samosa) ois.readObject();
//		System.out.println(s2.hashCode());
		
		 // BREAKING SINGLETON USING Cloning
		Samosa s1 = Samosa.getSamosa();
		System.out.println(s1.hashCode());
		Samosa s2 = (Samosa) s1.clone();
		System.out.println(s2.hashCode());

	}

}
