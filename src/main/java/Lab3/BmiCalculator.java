package Lab3;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters (e.g., 1.85): ");
        float heightGay = scanner.nextFloat();

        System.out.print("Enter your weight in kg (e.g., 72): ");
        float weightGay = scanner.nextFloat();

        //auto converts decimal to imperial
        if (heightGay > 3.0f) {
            heightGay = heightGay / 100.0f;
        }

        float bmiGay = (float) (weightGay / Math.pow(heightGay, 2));
        System.out.printf("Your BMI is: %.2f%n", bmiGay);

        if (bmiGay < 16.00f) {
            System.out.println("Category: starvation");
        } else if (bmiGay < 17.00f) {
            System.out.println("Category: emaciation");
        } else if (bmiGay < 18.50f) {
            System.out.println("Category: underweight");
        } else if (bmiGay < 23.00f) {
            System.out.println("Category: normal, low range");
        } else if (bmiGay < 25.00f) {
            System.out.println("Category: normal, high range");
        } else if (bmiGay < 27.50f) {
            System.out.println("Category: overweight, low range");
        } else if (bmiGay < 30.00f) {
            System.out.println("Category: overweight, high range");
        } else if (bmiGay < 35.00f) {
            System.out.println("Category: 1st degree obesity");
        } else if (bmiGay < 40.00f) {
            System.out.println("Category: 2nd degree obesity");
        } else {
            System.out.println("Category: 3rd degree obesity");
        }
    }
}