public class mainClass {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(15);

		Circle[] circles = { c1, c2, c3 };

		int index = 1;
		for (Circle circle : circles) {
			System.out.println("Circle " + index + " Area: " + Circle.computeArea(circle));
			index++;
		}
		System.out.println("******************************************************");
		Teacher[] teachers = new Teacher[] { new Teacher(1, Branchs.CS), new Teacher(2, Branchs.ENG),
				new Teacher(3, Branchs.MATH), new Teacher(4, Branchs.PHYSICS) };
		for (Teacher teacher : teachers) {
			System.out.println("Teacher ID: " + teacher.id);
			System.out.println("Branch : " + teacher.branch);
			System.out.println("Info: " + teacher.branch.getInfo());
		}

	}
}