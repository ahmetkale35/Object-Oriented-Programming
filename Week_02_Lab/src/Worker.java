
public class Worker {
	public String name;
	public int socialSecurityNumber;
	public float wage;
	public int workingHours;

	public static void displayInfo(Worker id) {
		System.out.println("Name : " + id.name);
		System.out.println("Social Security Number : " + id.socialSecurityNumber);
	}

	public static void displaySalary(Worker id) {
		System.out.println("Salary = " + id.wage * id.workingHours);
	}
}