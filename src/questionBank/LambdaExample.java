package questionBank;

public class LambdaExample {
    public static void main(String[] args) {
        Calculator multiply = (a, b) -> (a * a + b * b);

        int result = multiply.operate(5, 3);
        System.out.println("Result: " + result); // Outputs: Result: 15
    }
}
