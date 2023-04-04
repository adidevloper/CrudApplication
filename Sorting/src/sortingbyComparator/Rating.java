package sortingbyComparator;

import java.util.Comparator;

public class Rating implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		 Double d1=o1.rating;
		 Double d2=o2.rating;
		return d1.compareTo(d2);
	}

}
