package temp;

public class Test {
    public static void main(String[] args) {
        AB arr[] = {
          new AB("Rectangle", 10, 100),
          new AB("Triangle", 20, 30),
          new AB("Square", 50, 50)
        };

        A highestA = A.highest(arr);
        System.out.println(highestA);

        B highestB = B.highest(arr);
        System.out.println(highestB);
    }
}
