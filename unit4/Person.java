package unit4;

public class Person implements Student, Employee {

    public void study(){
        System.out.println("Person is studying...");
    }

    public void work(){
        System.out.println("Person is working...");
    }


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.work();
        p1.study();
    }

}
