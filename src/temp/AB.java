package temp;

public class AB implements A, B{
    private String type;
    private double height;
    private double width;

    public AB(String type, double height, double width) {
        this.type = type;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "AB{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
