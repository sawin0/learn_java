public class LoopExample {
    public static void main(String[] args) {
        System.out.println("Using for loop...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of i: " + i);
        }
        System.out.println("Using while loop...");
        int i = 1;
        while (i <= 10) {
            System.out.println("Value of i: " + i);
            i++;
        }
        System.out.println("Using do..while loop...");
        i = 1;
        do {
            System.out.println("Value of i: " + i);
            i++;
        } while (i <= 10);

        String[] names = { "Ram", "Hari", "Shyam", "Random", "Sabin" };
        for (String n : names) {
            if (n.equals("Random")) {
                continue;
            }
            System.out.println(n);
        }
    }
}
