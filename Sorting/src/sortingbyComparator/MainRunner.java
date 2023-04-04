package sortingbyComparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainRunner {

	public static void main(String[] args) {
		
		Rating r = new Rating();
		Price p  = new Price();
		
		Product p1=new Product("Samsung-S22", 53000, 4.7);
		Product p2=new Product("OnePlus-10Pro", 68000, 4.6);
		Product p3=new Product("Realme-9Pro", 22000, 4.5);
		Product p4=new Product("Iphone-13Pro", 115000, 5.0);
		Product p5=new Product("MI Not-12Pro", 54000, 4.8);
		Product p6=new Product("Oppo-Reno", 32000, 4.3);
		
		ArrayList<Product>al= new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		Collections.sort(al,p);
		for (Product pr:al) {
			System.out.println(pr);
		}
		//Collections.sort(al,Collections.reverseOrder());
//		Collections.sort(al,p);
//		for (Product pr:al) {
//			System.out.println(pr);
//		}
	}
	
}
