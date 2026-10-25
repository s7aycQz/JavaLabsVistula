package Lab4;

import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n-------------------------------------------");
            System.out.println("Choose what operation you want to perform:");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("W. Exit the program");
            System.out.print("Your choice: ");
            choice = scanner.next().toUpperCase();

            switch (choice) {
                case "A" -> {
                    System.out.print("Enter the base of the source system (2,3,4,5,6,8,9,10,16): ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the number in base " + base + ": ");
                    String numStr = scanner.next();
                    int decimalValue = Integer.parseInt(numStr, base);
                    System.out.println("Result in decimal (base 10): " + decimalValue);
                }
                case "B" -> {
                    System.out.print("Enter a decimal number (base 10): ");
                    int decNum = scanner.nextInt();
                    System.out.print("Enter target base (2,3,4,5,6,8,9,10,16): ");
                    int targetBase = scanner.nextInt();
                    System.out.println("Result in base " + targetBase + ": " + Integer.toString(decNum, targetBase).toUpperCase());
                }
                case "C", "D", "E", "F" -> {
                    System.out.print("Enter base of the first number: ");
                    int base1 = scanner.nextInt();
                    System.out.print("Enter first number: ");
                    int num1 = Integer.parseInt(scanner.next(), base1);

                    System.out.print("Enter base of the second number: ");
                    int base2 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = Integer.parseInt(scanner.next(), base2);

                    System.out.print("Enter target base for the result: ");
                    int targetBase = scanner.nextInt();

                    int result = 0;
                    switch (choice) {
                        case "C" -> result = num1 + num2;
                        case "D" -> result = num1 - num2;
                        case "E" -> result = num1 * num2;
                        case "F" -> {
                            if (num2 == 0) {
                                System.out.println("Cannot divide by zero!");
                                continue;
                            }
                            result = num1 / num2;
                        }
                    }
                    System.out.println("Result in base " + targetBase + ": " + Integer.toString(result, targetBase).toUpperCase());
                }
                case "W" -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (!choice.equals("W"));
    }
}