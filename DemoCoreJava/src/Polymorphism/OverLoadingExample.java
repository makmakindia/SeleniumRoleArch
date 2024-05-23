package Polymorphism;

public class OverLoadingExample {

	public static void main(String[] args) {
		
		
		OverLoadingExample obj = new OverLoadingExample();
		obj.add(0, 0);
		obj.add(0, 0, 0);
		
		obj.loginPortal(24234324, "secretcode");
		obj.loginPortal("username", "seretcode");

		
	}
	
	public void add(int a, int b) {
		
	}
	
	public void add(int a, int b, int c) {
		
	}
	
	public void loginPortal(String username, String password) {
		
	}
	
	public void loginPortal(int Phone, String passcode) {
		
	}



}