package Reference;

public class Main {

	public static void main(String[] args) {
	 XYZImpl a= new XYZImpl();
		
		ABC x=a::sum;
		int n=x.m1(5, 6);
		System.out.println(n);
		
		ABC y=a::mul;
		int o=y.m1(5,6);
		System.out.println(o);
		
		
		
	}
}
