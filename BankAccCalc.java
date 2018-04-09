package by.epam.tr.les08;

public class BankAccCalc {

	public static void main(String[] args) {

		BankAccount ba1 = new BankAccount();
		ba1.setIncome(110.20);

		BankAccount ba2 = new BankAccount();
		ba2.setPayment(110.20);

		BankAccount ba3 = new BankAccount();
		ba3.setNotes("You don't have any notes");

		System.out.println("Payment = " + ba2.getPayment());
		System.out.println("Income =  " + ba1.getIncome());

		if (ba1.equals(ba2)) {
			System.out.println("Your account balance is 0");

		} else {
			if (ba1.getIncome() > ba2.getPayment()) {
				System.out.println("Your account has a positive balance");
			}
			if (ba1.getIncome() < ba2.getPayment()) {
				System.out.println("Your account has a negative balance");

			}

		}
		System.out.println("Notes: " + ba3.getNotes());
	}

}
