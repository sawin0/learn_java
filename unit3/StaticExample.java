package unit3;

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(NepaliRandom.number);

        Student s1 = new Student("Ram", 1);
        Student s2 = new Student("Sabin", 2);

        s1.display();
        s2.display();

        // s1.displayRandomData();
        Student.displayRandomData();


    }

}
