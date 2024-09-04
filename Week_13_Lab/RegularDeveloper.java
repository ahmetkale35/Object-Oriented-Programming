package week13;

class RegularDeveloper extends Developer {
    double monthlySalary;

    RegularDeveloper(int id, String fullName, double monthlySalary) {
        super(id, fullName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double income() {
        return monthlySalary;
    }
}
