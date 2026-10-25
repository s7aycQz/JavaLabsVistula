package Lab4;

import java.util.Scanner;

class RectangleArea {
    private double lengthGay;
    private double widthGay;
    private double areaGay;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        lengthGay = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        widthGay = scanner.nextDouble();
    }

    public void computeField() {
        areaGay = lengthGay * widthGay;
    }

    public void fieldDisplay() {
        System.out.printf("Rectangle with length %.2f and width %.2f has an area of: %.2f%n",
                lengthGay, widthGay, areaGay);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        RectangleArea rectGay = new RectangleArea();
        rectGay.getData();
        rectGay.computeField();
        rectGay.fieldDisplay();
    }
}