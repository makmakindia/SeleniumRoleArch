package Democomp1;

public class singletonTest {
	
	private static singletonTest instance = new singletonTest();
	/* Predefined rules for singleton implementation 
	 * 1. Singleton class should have private constructor 
	 * 2. 
	 * 
	 */

	private singletonTest() {
		System.out.println("Singleton Test private constructor.....!");
	}
	
	
	public static singletonTest getInstance() {
		return instance;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
