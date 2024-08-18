package GitRepo;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
 
	private String name;
 private int age;
	public Employee()
	{
		
	}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
@Override
public boolean equals(Object o)
{
	
	System.out.println("Equals method overidded");
	if(this == o)return true;
	if(o ==null ||getClass()!= o.getClass()) return false;
	Employee employee = (Employee)o;
	return age==employee.age && Objects.equals(name, employee.name);
	
}
@Override
public int hashCode()
{
	System.out.println("hashCode method overidded");
	int result =Objects.hash(name,age);
	//result=31*result+Arrays.hashCode(age);
	return result;

	
	//return age;
	
}

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + "]";
}
	
	
	
}
