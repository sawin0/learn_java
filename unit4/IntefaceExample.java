package unit4;

public class IntefaceExample {
    public static void main(String[] args) {
        Student s1 = new Student(){
            @Override
            public void study() {
                System.out.println("S1 is student who is studying...");
            }
        };

        Student s2 = () -> System.out.println("S2 is student who is studuing...");

        s1.study();
        s2.study();
    }
}
