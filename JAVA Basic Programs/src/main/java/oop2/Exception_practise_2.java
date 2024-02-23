package oop2;

class InvalidAmount extends Exception {
	public InvalidAmount() {
		System.out.println("enter amount greater than 100 and round figures");
	}
//	public InvalidAmount(String msg)
//	{
//		super(msg);
//	}
}

class atm extends Exception {
	public atm() {
		System.out.println("not enough balance");
	}
}

class operations1 {
	static int balance;

	public operations1(int balance) {
		super();
		this.balance = balance;
	}

	public void deposit(int amount) throws InvalidAmount //// should give class names not method names....
	{
		if (amount < 100) {
			throw new InvalidAmount(); // should give class names not method names....
		} else {
			balance += amount;
			System.out.println(balance);
		}
	}

	public void withdraw(int amount) throws atm, InvalidAmount {
		if (amount < 100) {
			throw new InvalidAmount();
		} else if (amount > balance) {
			throw new atm();
		} else {
			balance -= amount;
			System.out.println(balance);
		}
	}
}

public class Exception_practise_2 {

	public static void main(String[] args) {
		System.out.println("enter balance");
		operations1 o = new operations1(3000);
		try {
			o.deposit(3000);
		} catch (InvalidAmount a) {
			System.out.println(a);
		}
		try {
			o.withdraw(3000);
		} catch (InvalidAmount | atm e) {
			System.out.println(e);
		}
		try {
			o.deposit(30);
		} catch (InvalidAmount a) {
			System.out.println(a);
		}
		try {
			o.withdraw(30000);
		} catch (InvalidAmount | atm a) {
			System.out.println(a);
		}

	}

}
