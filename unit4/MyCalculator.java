package unit4;

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 7));
        System.out.println(calculator.add(11.2, 7.9));
        System.out.println(calculator.add(11, 7.2));

    }
}
