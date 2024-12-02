public class GenericClass <T>{
    private T name;
    private T age;

    public GenericClass(T name, T age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass("Raihan ", 32);

        System.out.println(genericClass);
    }
}
