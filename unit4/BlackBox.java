package unit4;

public abstract class BlackBox {
    int age;
    BlackBox(int age){
        this.age = age;
        System.out.println("This is age " + this.age);
        System.out.println("This is the constructor of Abstract BlackBox Class...");
    }

    final void finalMethod(){
        System.out.println("This is the final method.");
    }

    static void staticMethod(){
        System.out.println("This is the static method.");
    }

    abstract void startRecord();

    void stopRecord(){
        System.out.println("Recording stop...");
    }
}
