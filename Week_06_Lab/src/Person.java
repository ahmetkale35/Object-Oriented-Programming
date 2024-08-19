public class Person {
	private static int idCounter = 0;

	private int id;
	private String firstName;
	private String lastName;
	private int age;

	public Person(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person(String firstName, String lastName) {
		this(idCounter++, firstName, lastName, 0);
	}

	public Person(int id) {
		this(id, "Ahmet", "Kale", 23);
	}

	public Person() {
		this(idCounter++, "Ahmet", "Kale", 23);
	}

	public void displayInfo() {
		System.out.println("ID: " + id);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
	}
}
