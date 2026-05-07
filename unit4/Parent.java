package unit4;

public class Parent extends GrandParent {
    String name;

    Parent(String name){
        this.name = name;
    }

    void printName(){
        System.out.println("Name: " + name);
    }
}
