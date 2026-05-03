package unit3;

public class Student {
    String name;
    int rollNo;
    static String college = "ABC";

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println(name + " " + rollNo + " " + college);
    }

    static void displayRandomData(){
        System.out.println("this is a random data...");
    }
}
