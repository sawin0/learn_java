package unit4;

public class AbstractionExample extends BlackBox{

    AbstractionExample(int age){
        super(age);
    }

    @Override
    void startRecord() {
        System.out.println("Start recording...");
    }

    // @Override
    // void stopRecord() {
    //     System.out.println("Stop recording... is override...");
    // }



    public static void main(String[] args) {
        AbstractionExample aExample = new AbstractionExample(19);
        aExample.startRecord();
        aExample.stopRecord();
        aExample.finalMethod();
        BlackBox.staticMethod();
    }

}
