package sortingbyComparator;

public class Product {

	String name;
	Integer  price;
	double rating;
	public Product(String name, Integer price, double rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

}
