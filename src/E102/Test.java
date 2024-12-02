package E102;

public class Test {
    public static void main(String[] args) {
        Measurable arr[] = {
                new Quiz(60.7, "A-"),
                new Quiz(80, "A+"),
                new Quiz(75, "A"),
                new Quiz(90, "A+")
        };

        Measurable highest = Measurable.highest(arr);
        System.out.println(highest);

        System.out.println("Average: " + Measurable.average(arr));
    }
}
