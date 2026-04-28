public class ShiftOperatorExample {
    public static void main(String[] args) {
        int x = 5;
        int result = x << 1; // x * 2^1 = 10
        System.out.println("Value of x: " + result);
        // 1010 = 10

        result = x << 2; // x * 2^2 = 20
        System.out.println("Value of x: " + result);

        int y = 20;
        result = y >> 1; // 20 / 2^1 = 10
        System.out.println("Value of y: " + result);

        result = y >> 2; // 20 / 2^2 = 5
        System.out.println("Value of y: " + result);

        result = y >>> 1;
        System.out.println("Value of y: "+ result);

        int z = -8;
        result = z >>> 1;
        System.out.println("Value of z: " + result);

    }
}
