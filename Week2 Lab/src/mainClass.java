import java.util.Scanner;

import org.xml.sax.ext.Attributes2;

public class mainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Worker w1 = new Worker();
		w1.name = "Ahmet";
		Worker.displayInfo(w1);
		Worker.displaySalary(w1);
		Worker w2 = new Worker();
		System.out.println("New Worker Has ben created\n");
		System.out.print("\n Please enter the new worker name : ");
		w2.name = input.nextLine();
		System.out.print("Social Security Number : ");
		w2.socialSecurityNumber = input.nextInt();
		System.out.print("Wage : ");
		w2.wage = input.nextFloat();
		System.out.print("Working hours : ");
		w2.workingHours = input.nextInt();
		Worker.displayInfo(w2);
		Worker.displaySalary(w2);
	}

}
