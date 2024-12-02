package E101;

public class BankAccount implements Measurable{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }

    @Override
    public String toString() {
        return "Measure:" + getMeasure();
    }
}
