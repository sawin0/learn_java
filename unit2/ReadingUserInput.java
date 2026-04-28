import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your roll no: ");
        int rollNo = sc.nextInt();
        System.out.println("Your roll no: " + rollNo);

        sc.close();
    }
}
