package unit4;

public class InheritanceExample {
    public static void main(String[] args) {
        Child c1 = new Child("Ram", 7);
        c1.printName();
        c1.printAge();
        c1.printInfo();

        Parent p1 = new Parent("Shyam");
        p1.printName();
        p1.printInfo();

        GrandParent g1 = new GrandParent();
        g1.printInfo();
    }
}
