package Testing;

public class Father {
	void run() {
		System.out.println("father");
	}
	public static void main(String[] args) {

		Father f= new Father();
		f.run();

		Father f1 = new Son();//change in object will lead to change in method binding (Dynamic Binding)
		f1.run();
		Father f2 = new Daughter();//change in object will lead to change in method binding (Dynamic Binding)
		f2.run();

	}
}
