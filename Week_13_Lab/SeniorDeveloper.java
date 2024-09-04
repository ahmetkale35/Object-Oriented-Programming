package week13;

class SeniorDeveloper extends RegularDeveloper implements PromotionBehaviour {
    SeniorDeveloper(int id, String fullName, double monthlySalary) {
        super(id, fullName, monthlySalary);
    }

    @Override
    public double getPromotion() {
        return 1.5 * monthlySalary;
    }

    @Override
    double income() {
        return monthlySalary + getPromotion();
    }
}
