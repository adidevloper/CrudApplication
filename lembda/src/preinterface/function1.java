package preinterface;

import java.util.function.Function;

public class function1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(5));
		System.out.println(f.apply(6));
		
		Function<String, String> f1=j->j+j;
		System.out.println(f1.apply("aditya"));
		System.out.println(f1.apply("honey"));
		
		Function<String, Integer> f2=j->j.length();
		System.out.println(f2.apply("aditya"));
		System.out.println(f2.apply("honey"));
	}
}
