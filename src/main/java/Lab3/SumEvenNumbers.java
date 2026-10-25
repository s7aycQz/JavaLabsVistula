package Lab3;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int sumGay = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumGay += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 100 is: " + sumGay);
    }
}