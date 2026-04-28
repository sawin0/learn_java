public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int x = 5; // 0101
        int y = 3; // 0011
        System.out.println(x & y); // x & y = 0001
        System.out.println(x | y); // x | y = 0111
        System.out.println(x ^ y); // x ^ y = 0110
        System.out.println(~x); // ~x = 1010
    }
}
