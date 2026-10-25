package Lab3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumberGay = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumberGay = scanner.nextFloat();

        float sumGay = firstNumberGay + secondNumberGay;
        float differenceGay = firstNumberGay - secondNumberGay;
        float productGay = firstNumberGay * secondNumberGay;
        float quotientGay = firstNumberGay / secondNumberGay;

        System.out.printf("Sum: %.2f%n", sumGay);
        System.out.printf("Difference: %.2f%n", differenceGay);
        System.out.printf("Product: %.2f%n", productGay);
        if (secondNumberGay != 0) {
            System.out.printf("Quotient: %.2f%n", quotientGay);
        } else {
            System.out.println("Quotient: Cannot divide by zero!");
        }
    }
}