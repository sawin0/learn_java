public class IfElseExample {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote.");
        }

        char grade = 'F';
        if(grade == 'A'){
            System.out.println("Excellent...");
        } else if(grade == 'B'){
            System.out.println("Good");
        } else if(grade == 'C'){
            System.out.println("Okay");
        } else {
            System.out.println("Study hard...");
        }
    }
}
