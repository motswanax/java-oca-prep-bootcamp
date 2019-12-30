package introToObjects;

/**
 * Car template
 *
 * @author bad
 */
public class Car {
    // instance variables
    private String color;
    private String type;

    private Car() {
        color = "Blue";
    }

    // behaviour
    void start() {
        System.out.println("Get started!");
    }

    private void printDescription() {
        System.out.println("This is a " + color + " " + type);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printDescription();
    }
}
