
public class Worker {
	private String name;
	private int salary;
	
	static public int counter;
	

public void setName(String name) {
	this.name = name;
	counter++;
}

public void setSalary(int salary) {
	this.salary = salary;
}


}