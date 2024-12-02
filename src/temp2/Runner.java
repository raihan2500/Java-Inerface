package temp2;

import E101.BankAccount;
import E101.Measurable;

public class Runner {
    public static void main(String[] args) {
        Measurable[] arr = {
                new Employee("Raihan", 100),
                new Employee("Jack", 50),
                new Employee("Milan", 101)
        };

        Measurable largest = Measurable.largest(arr);
        System.out.println(largest);

        Abacus<Integer> sum = (int a, int b)->( a + b);
        System.out.println(sum.op(3, 5));
    }
}
