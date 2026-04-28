import java.util.Arrays;

public class NonPrimitiveDataTypeExample {
    public static void main(String[] args) {

        String name1 = new String("Sabin");
        String name2 = new String("Sabin");
        boolean isSame = name1.equals(name2);
        System.out.println("Is same: " + isSame);

        name2 = name1.repeat(3);
        System.out.println("Name repeated: " + name2);

        int[] myArray = {1,2,3,4,5};
        System.out.println("Array: " + Arrays.toString(myArray));
    }
}
