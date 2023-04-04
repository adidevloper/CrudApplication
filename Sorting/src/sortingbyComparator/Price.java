package sortingbyComparator;

import java.util.Comparator;

public class Price implements Comparator<Product>{

	@Override
	public int compare(Product x1, Product x2) {
		 Integer l1=x1.price;
		 Integer l2=x2.price;
		return l1.compareTo(l2);
				
	}

}
