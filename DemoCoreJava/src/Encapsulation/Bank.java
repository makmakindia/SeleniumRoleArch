package Encapsulation;

public class Bank {

	public int accountNo = 123456;
	private int pinNo = 1234;
	public double balanceAmount = 1000000;

	public void withdraw(int accNo, int pin, int amount) {

		if (accNo == accountNo && pin == pinNo){
			if (amount < balanceAmount) {
				balanceAmount = balanceAmount - amount;
				System.out.println("Amount withdrwal : " + amount);
			} else {
				System.out.println("Inssuficient Blalance .....!!!!");
			}
		} else {
			System.out.println("Invalid Credentials !!!");
		}
	}

	public void UpdatePin(int accNo, int oldPin, int newPin) {

		if (accNo == accountNo && oldPin == pinNo) {

			pinNo = newPin;
			System.out.println("Pin changed succesfully....!!!");
		} else {
			System.out.println("Invalid credentials ...!!!!");
		}
	}

	public double depositCash(int accNo, int pin, double amount) {
		if (accNo == accountNo && pin == pinNo) {
			balanceAmount = balanceAmount + amount;
			return balanceAmount;
		} else {
			System.out.println("Invalid Transaction ... enter correct accountNo & Pin");
			return balanceAmount;
		}

	}

}
