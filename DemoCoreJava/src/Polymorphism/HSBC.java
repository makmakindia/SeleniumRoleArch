package Polymorphism;

public class HSBC extends RBI{

	public static void main(String[] args) {
		
		HSBC obj = new HSBC();
		
		System.out.println(obj.getCarLoanROI());
		

	}
	
	public double getCarLoanROI() {
		return 14.25;
	}

}
