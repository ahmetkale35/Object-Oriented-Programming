
public class hospital {

	public static void main(String[] args) {
		Patient[] patients = new Patient[4];

		patients[0] = new Patient("Ahmet");
		patients[1] = new Patient("Mehmet");
		patients[2] = new Patient("Okan");
		patients[3] = new Patient("Yusuf");

		for (Patient p : patients) {
			System.out.println("-----------------------------------------------------");
			System.out.println(p);
		}

	}

}
