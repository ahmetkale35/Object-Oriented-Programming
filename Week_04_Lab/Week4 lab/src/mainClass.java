//Lab Exercise 1: Exception Handling

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sca1 = new Scanner(System.in);
		try {
			int a = sca1.nextInt();
		}
		catch(Exception InputMismatchException) {
			System.out.println("Wrong input. It must be an integer.");
		}

	}

}
