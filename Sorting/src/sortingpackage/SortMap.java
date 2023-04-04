package sortingpackage;
import java.util.Map;  
import java.util.HashMap;  
import java.util.TreeMap;  
import java.util.Iterator;  
public class SortMap {
 
public static void main(String args[])  
{  
 
	HashMap<Integer, String> hm=new HashMap<Integer, String>();  
	    
	hm.put(23, "Aditya");  
	hm.put(17, "Ravindra Sir");  
	hm.put(1, "Omer");  
	hm.put(2, "Siid"); 
	hm.put(11, "Omer");
	Iterator <Integer> it = hm.keySet().iterator();         
	System.out.println("Before Sorting");  
	while(it.hasNext())  
	{  
	int key=(int)it.next();  
	System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
	}  
	System.out.println("\n");  
	
	Map<Integer, String> map=new HashMap<Integer, String>();  
	System.out.println("After Sorting");  
	 
	TreeMap<Integer,String> tm=new  TreeMap<Integer,String> ();  
	Iterator<Integer> itr=tm.keySet().iterator();               
		while(itr.hasNext())    
		{    
		int key=(int)itr.next();  
		System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		}    
}  
}  
