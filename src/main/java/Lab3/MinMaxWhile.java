package Lab3;

import java.util.Random;

public class MinMaxWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int countGay = 0;
        int minGay = 101;
        int maxGay = 0;

        System.out.print("Drawn numbers: ");
        while (countGay < 10) {
            int drawnNumberGay = random.nextInt(100) + 1;
            System.out.print(drawnNumberGay + " ");

            if (drawnNumberGay < minGay) {
                minGay = drawnNumberGay;
            }
            if (drawnNumberGay > maxGay) {
                maxGay = drawnNumberGay;
            }
            countGay++;
        }

        System.out.println("\nSmallest number: " + minGay);
        System.out.println("Largest number: " + maxGay);
    }
}