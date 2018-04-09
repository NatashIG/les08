package by.epam.tr.les08_2;

import java.util.ArrayList;

public class Cart {

	public static void main(String[] args) {

		Goods g1 = new Goods("Apple", 2.5, 4.2);
		Goods g2 = new Goods("Potato", 1, 0.9);
		Goods g3 = new Goods("Bread", 1);
		Goods g4 = new Goods("Milk", 2);

		Payment p1 = new Payment();

		p1.add(g1);
		p1.add(g2);
		p1.add(g3);
		p1.add(g4);

		System.out.println(p1);

		System.out.println("Total goods: " + p1.calcGoods());
		System.out.println("Total weight: " + p1.calcWeight());
		System.out.println("Total amount: " + p1.calcPayment());

		Goods g5 = new Goods("Orange", 1.8, 5.3);

		p1.add(g5);
		p1.delete(g1);
		p1.delete(g4);

		System.out.println(p1);

		System.out.println("Total goods: " + p1.calcGoods());
		System.out.println("Total weight: " + p1.calcWeight());
		System.out.printf("Total amount: " + p1.calcPayment());
	}
}
