package inheritance;

public class Animal {

	/*
	 * Inheritance: 
	 * 1. process of one object properties acquiring to other object 
	 * 2.Helps to more manageable in hierarchical order 
	 * 3. In other words - its relation between superclass ( Parent) and subclass (Child) 
	 * 4. Inheritance relationship achieved using extends keyword 
	 * Example: 
	 * public class Animal(){} //
	 * superclass public class Cat extends Animal(){ }// cat is subclass} public
	 * class Dog extends Animal(){} // subclass
	 * Types: 1. Single 2. Multiple 3. Multilevel 4. Hybrid 5. Hierarchical 
	 * In case of java Inheritance applied at class level or Interface level 
	 * class --> class , Interface --> Interface then --> Extends 
	   possible types at class are --> single, multilevel and Hierarchical 
	   class --> Interface we use implements keyword 
	   possible type to implements at Interface level --> single, multilevel , Hierarchical & Multitple
	 */

	public void sound() {

		System.out.println("Generate Sound!!!!");
	}

}
