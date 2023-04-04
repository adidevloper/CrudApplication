package sortingbyComparableTo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {

		Employee e1= new Employee("Aditya", 500);
		Employee e2= new Employee("Ravindra Sir", 600);
		Employee e3= new Employee("Omer", 300);
		Employee e4= new Employee("Siid", 700);
		Employee e5= new Employee("Adi", 100);

		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		Collections.sort(al);
		System.out.println("Sorting in descending order using Comparable");
		System.out.println("");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));

		}
		System.out.println("---------------------------------------------");

		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorting in ascending order using Comparable");
		System.out.println("");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));

		}
	}
}
