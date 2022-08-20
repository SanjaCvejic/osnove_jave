package d18_08_2022;

public class Proizvod_1 {
	
	public String name;
	public double price;
	public double weight;
	
	public void print () {
		System.out.println("{{" + this.name + "}}, {{" + this.price + "}}, {{" + this.weight + "}}");
	}
	
	public void upPrice (double increase) {
		this.price = this.price + increase;
	}
	
	public double discountPrice (double discount) {
		return (this.price / 100) * (100 - discount);
	}
	
	public double shippingFee () {
		if (this.weight > 100 && this.weight < 500) {
			return 400.0; 
		} else if (this.weight > 500) {
			return 1000.0;
		} else {
			return 200.0;
		}
	}

}
