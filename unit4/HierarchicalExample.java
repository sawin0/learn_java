package unit4;

public class HierarchicalExample {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.start("Bike");
        b1.ride();

        Car c1 = new Car();
        c1.start("Car");
        c1.drive();
    }
}
