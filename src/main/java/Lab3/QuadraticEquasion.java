package Lab3;

import java.util.Scanner;

public class QuadraticEquasion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double aGay = scanner.nextDouble();
        if (aGay == 0) {
            System.out.println("Error: 'a' cannot be zero in a quadratic equation.");
            return;
        }

        System.out.print("Enter b: ");
        double bGay = scanner.nextDouble();
        System.out.print("Enter c: ");
        double cGay = scanner.nextDouble();

        System.out.printf("Equation: %.2fx^2 + %.2fx + %.2f = 0%n", aGay, bGay, cGay);

        double deltaGay = Math.pow(bGay, 2) - (4 * aGay * cGay);
        int numberOfRootsGay;

        if (deltaGay > 0) {
            numberOfRootsGay = 2;
        } else if (deltaGay == 0) {
            numberOfRootsGay = 1;
        } else {
            numberOfRootsGay = 0;
        }

        switch (numberOfRootsGay) {
            case 2 -> {
                double x1Gay = (-bGay - Math.sqrt(deltaGay)) / (2 * aGay);
                double x2Gay = (-bGay + Math.sqrt(deltaGay)) / (2 * aGay);
                System.out.printf("Two roots found: x1 = %.2f, x2 = %.2f%n", x1Gay, x2Gay);
            }
            case 1 -> {
                double x1Gay = -bGay / (2 * aGay);
                System.out.printf("One root found: x1 = %.2f%n", x1Gay);
            }
            case 0 -> System.out.println("No real roots exist (delta < 0).");
        }
    }
}