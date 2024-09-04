package week13;

class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour {
    int hours;
    int unitPrice;

    FreelanceDeveloper(int id, String fullName, int hours) {
        super(id, fullName);
        this.hours = hours;
    }

    @Override
    double income() {
        return hours * unitPrice + getBonusSalary();
    }

    @Override
    public double getBonusSalary() {
        return hours * 1.5;
    }
}
