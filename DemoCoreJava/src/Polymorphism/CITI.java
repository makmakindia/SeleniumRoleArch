package Polymorphism;

public class CITI extends RBI {

	public static void main(String[] args) {
		
		CITI obj = new CITI();
		System.out.println(obj.getHomeLoanROI());

	}
	
	
	public double getHomeLoanROI() {
		return 11.25;
	}

}
