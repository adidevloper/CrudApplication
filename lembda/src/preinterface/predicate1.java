package preinterface;
 
import java.util.function.*;
public class predicate1 {

	public static void main(String[] args) {
		Predicate<String> p = s1->s1.length()>5;
		
		System.out.println(p.test("ADITYA"));
	
	
	    Predicate<Integer> p1 = n1->n1>5;
	
	     System.out.println(p1.test(4));
   }
 }
