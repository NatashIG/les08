package by.epam.tr.les08_2;

public class Goods {

	String name;
	double weight;
	double price;

	public Goods(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public Goods(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());

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
		Goods other = (Goods) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return name;
	}
}
