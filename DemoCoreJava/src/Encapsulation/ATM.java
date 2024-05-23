package Encapsulation;

public class ATM {

	/*
	 * Encapsulation - data binding, Wrapping data & methods into single unit
	 * provides security - hiding data from outside world They can't directly access
	 * force calling those variables using methods (Setters * Getters)
	 */

	public static void main(String[] args) {

		Bank obj = new Bank();

		obj.withdraw(123456, 1234, 2000);

		// obj.PinNo=2222; // Security breach: stolen and reset PinNo withdraw amount
		obj.withdraw(123456, 2222, 2000);

		// Solution : outside can't be accessible
		// - make it as private and access using another method

		// Actual user want to chnage the pin call method seperate methid
		obj.UpdatePin(123456, 1234, 3333);
		obj.withdraw(123456, 1234, 2000); // old pin
		obj.withdraw(123456, 3333, 2000); // new pin

		/*
		 * pinNo is access through metod , so data and member access through method, but
		 * not directly... this called Encapsulation
		 * 
		 */

	}

}
