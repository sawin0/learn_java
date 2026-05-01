package unit3;

public class Person {
    String name;
    String address;
    int age;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
