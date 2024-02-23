package oop2;

enum paymentMode {
	cash, card, UPI, NEFT;
}

class operations {
	int amount;
	paymentMode p;

	public operations(int amount, paymentMode p) {
		super();
		this.amount = amount;
		this.p = p;
	}

	public int getAmount() {
		return amount;
	}

	public double getCharge() {
		switch (p) {
		case cash: {
			return 0;

		}
		case card: {
			return (getAmount() * (2.5 / 100));
		}
		case UPI: {
			return getAmount() * (1.5 / 100);
		}
		case NEFT: {
			return getAmount() * (0.5 / 100);
		}
		}
		return amount;
	}

	public double netAmount() {
		return getAmount() - getCharge();
	}

}

public class transactions {

	public static void main(String[] args) {
		operations o = new operations(2000, paymentMode.cash);
		System.out.println(o.getAmount());
		System.out.println(o.netAmount());
	}
}
