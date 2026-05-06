package unit4;

public class Child extends Parent {

    int age;

    Child(String name, int age){
        super(name);
        this.age = age;
    }

    void printAge(){
        System.out.println("Age: " + age);
    }

}
