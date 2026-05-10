public class Average {
public static void main(String[] args) {
    int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12, -100, 234, 17, -257 };
    int sum = 0;
    float avg = 0;
    for(int i = 0; i < numbers.length; i++){
        sum += numbers[i];
    }
    avg = sum / numbers.length;
    System.out.printf("Average: %.4f", avg);
}
}
