public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray;

        myArray = new int[5];

        myArray[4] = 10;
        myArray[1] = 40;
        myArray[2] = 20;
        myArray[3] = 30;
        myArray[0] = 50;

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        String[] names = new String[5];
        names[0] = "Sabin";

        for (String name: names) {
            System.out.println(name);
        }

    }
}
