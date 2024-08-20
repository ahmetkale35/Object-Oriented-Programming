
public class Patient {
	private int patientId;
	private String name;
	private static int patientCounter = 0;

	public Patient(String name) {
		this.patientId = ++patientCounter;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPatientId() {
		return patientId;
	}

	@Override
	public String toString() {
		return getPatientId() + " . " + "Patient Id: " + getPatientId() + "\nPatient Name: " + getName();
	}
}
