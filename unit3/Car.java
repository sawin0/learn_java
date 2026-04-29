package unit3;

public class Car {
    // declaring instance variables
    String color;
    String company;
    int makeYear;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        System.out.println("MyCar color: " + myCar.color);
    }
}
