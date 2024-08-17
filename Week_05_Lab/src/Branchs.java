enum Branchs {
	MATH("y = dy/dx"), PHYSICS("E = MC^2"), CS("Hello World"), ENG("My name is Ahmet");

	String info;

	Branchs(String info) {
		this.info = info;
	}

	public String getInfo() {
		return this.info;
	}
}