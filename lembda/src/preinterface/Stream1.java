package preinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		ArrayList <Integer> marks = new ArrayList<Integer>();
		marks .add(31);
		marks .add(42);
		marks .add(73);
		marks .add(94);
		marks .add(25);
		System.out.println( marks );
		
		//if  you want to process object from collection we use Stream
	   // advantage  of  stream  is reduce the code
      //filter is used to filter the group of  object based on user requirement and return boolean
		List<Integer> collect = marks.stream().filter(s->s>=50).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List <Integer>l1=  marks .stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		//map  is used to change the group of object and provide new object
		List <Integer>l2=  marks .stream().map(i->i+20).collect(Collectors.toList());
		System.out.println("*"+l2);
		
		// count  is count the number of object
		long  lessmarks =  marks .stream().filter(i->i<35).count();
		System.out.println(lessmarks);

		//Sorted: will sort in DNS order
		List <Integer> Sort=  marks.stream().sorted().collect(Collectors.toList());
		System.out.println(Sort);

		// For Custom sorting We can use Comparator using Lambda  Because Comparator is Functional Interface 
		List <Integer> CustomSort=  marks.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		System.out.println(CustomSort);
		
		// For custom Sorting we can we CompareTo method
		List <Integer> CustomSort2=  marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(CustomSort2);
		
		//for Reverse Using Compare to we Use (-) sign before argument or interchange i2 first then i1 last
		List <Integer> CustomSort3=  marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(CustomSort3);
				
		//To find min object  use  min
		Integer minn=  marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minn);
		
		// TO find Max object we use  max 
		Integer maxx=  marks .stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxx);
		
		


	}

}
