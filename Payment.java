package by.epam.tr.les08_2;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Goods> payment = new ArrayList<Goods>();

	public Payment() {
	}

	public void add(Goods goods) {
		payment.add(goods);
	}

	public boolean delete(Goods goods) {
		return payment.remove(goods);
	}

	public double calcPayment() {
		double sum = 0;
		for (Goods goods : payment) {
			sum += goods.getPrice();
		}
		return sum;
	}

	public double calcWeight() {
		double sum = 0;
		for (Goods goods : payment) {
			sum += goods.getWeight();
		}
		return sum;
	}

	public double calcGoods() {
		return payment.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Total new goods list: " + payment;
	}
}
