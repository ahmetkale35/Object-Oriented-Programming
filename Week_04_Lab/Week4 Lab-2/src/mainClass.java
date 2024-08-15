import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) throws Exception {
		Worker Worker1 = new Worker();
		Worker Worker2 = new Worker();
		Worker Worker3 = new Worker();

		Scanner sca1 = new Scanner(System.in);

		String str = sca1.nextLine();
		Worker1.setName(str);
		int salary = sca1.nextInt();

		if (salary >= 0) {
			Worker1.setSalary(salary);
		} else {
			throw new Exception("salary amount must be greater than zero");
		}

		str = sca1.next();
		Worker2.setName(str);
		salary = sca1.nextInt();

		if (salary >= 0) {
			Worker2.setSalary(salary);
		} else {
			throw new Exception("salary amount must be greater than zero");
		}

		str = sca1.next();
		Worker3.setName(str);
		salary = sca1.nextInt();

		if (salary >= 0) {
			Worker3.setSalary(salary);
		} else {
			throw new Exception("salary amount must be greater than zero");
		}

		System.out.printf("There is %d worker.", Worker.counter);

	}

}
