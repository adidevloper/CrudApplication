package mycons;

public class Main{

	public static void main(String[] args) {
		
//		Myconsimpl s = new Myconsimpl();
		
		Mycon x= Myconsimpl::new;
		
		x.m1(25,75);
	}
}
