
public class mainClass {

	public static void main(String[] args) {
	
        Person person1 = new Person(1, "Yusuf", "Yılmaz",25);
        person1.displayInfo();

        Person person2 = new Person("Yusuf", "Yılmaz");
        person2.displayInfo();

        Person person3 = new Person(3);
        person3.displayInfo();

        Person person4 = new Person();
        person4.displayInfo();
    }
	}

