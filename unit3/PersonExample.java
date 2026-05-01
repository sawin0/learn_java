package unit3;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("Sabin", "Kathmandu", 19);
        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.age);

        Person p2 = new Person(19);
        System.gc();


    }
}
