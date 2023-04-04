package preinterface;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		
		Consumer<String> c= s->System.out.println(s);
		c.accept("consume data but does not return anything");
		
		Consumer<Integer> c1= s->System.out.println(s*s);
		c1.accept(5);
		
	}
}
