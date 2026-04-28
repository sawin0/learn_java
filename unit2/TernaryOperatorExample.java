public class TernaryOperatorExample {
    public static void main(String[] args) {
        int x = 6;
        if(x == 5){
            System.out.println("Yay, x is five");
        } else {
            System.out.println("Ooops, x is not five");
        }
        // (condition) ? true statement : false statement
        System.out.println((x == 5) ? "Yay, x is five" : "Ooops, x is not five");
    }
}
