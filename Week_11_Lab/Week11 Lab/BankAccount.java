package Week12Lab1;

class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void balanceChange(double amount) {
        balance -= amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(BankAccount other) {
        return this.holderName.compareTo(other.holderName);
    }
    
    @Override
    public String toString() {
        return "Account No: " + getAccountNo() +
                ", Holder Name: " + getHolderName() +
                ", Balance: " + getBalance();
    }
}
