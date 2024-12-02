package E101;

public class Test {
    public static void main(String[] args) {
        Measurable[] bankAccount = {
                new BankAccount(10.5),
                new BankAccount(20),
                new BankAccount(30)
        };

        Measurable largest = Measurable.largest(bankAccount);
        Measurable smallest = Measurable.smallest(bankAccount);


        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);


    }
}
