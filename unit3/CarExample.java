package unit3;

public class CarExample {
    public static void main(String[] args) {
        // creating object, myCar of Car class.
        Car myCar = new Car();

        // direct assignment of instance variable
        myCar.color = "Blue";
        myCar.company = "BYD";
        myCar.makeYear = 2026;

        System.out.println("Car details:");
        System.out.println("Company: " + myCar.company);
        System.out.println("Make year: " + myCar.makeYear);
        System.out.println("Color: " + myCar.color);

        Car secondCar = new Car();
        secondCar.color = "Black";
        System.out.println("Color of second car: " + secondCar.color);
    }
}
