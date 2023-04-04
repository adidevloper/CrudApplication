package sortingpackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(80);
		al.add(170);
		al.add(60);
		al.add(150);
		al.add(40);
		al.add(300);
		
	System.out.println("Before sorting"+al);
	Collections.sort(al);
	System.out.println("After Sorting in Ascending Order"+al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println("After sorting in Descending Order"+al);
	}

}
