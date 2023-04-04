package sortingbyComparableTo;

public class Employee implements Comparable<Employee> {

	String name;
	int sal;
	@Override
	public int compareTo(Employee e) {
		if (this.sal==e.sal)
			return 0;
		else if(this.sal>e.sal)
			return -1;
		else
			return 1;
	}
	
// 2 rule for comparing
//	@Override
//	public int compareTo(Employee e) {
//	Integer i1=this.sal;
//	Integer i2=e.sal;
//	return i1.compareTo(i2)*-1;
//	}
	
	public Employee(String name,int sal) {
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return this.name+" "+this.sal;
	}
	 
}
