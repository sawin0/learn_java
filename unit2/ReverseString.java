import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        // Sabin Ranabhat
        String[] names = name.split(" ");
        String firstName = names[0];
        String lastName = names[names.length - 1 ];
        // {"Ram", "Bdr", "Thapa"};
        System.out.println("Hello, " + firstName);
        System.out.println("Your last name is " + lastName);
        //

        sc.close();
    }
}
