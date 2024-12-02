package E103;

public class Person implements Data{
    private String name;
    private double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public double getMeasure() {
        return height;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Height: " + height + "\n";
    }

}
