package Lab2;

public class MarsWeight {
    
    static float earthWeightGay = 72.0f;
    static float marsGravityGay = 0.38f;
    static double marsWeightDoubleGay;
    static int marsWeightIntGay;
    static char marsWeightCharGay;
    static int finalMathIntGay;

    public static void main(String[] args) {
        marsWeightDoubleGay = earthWeightGay * marsGravityGay;
        System.out.println("Earth weight (float): " + earthWeightGay + " kg");

        System.out.printf("Weight on Mars (double, 4 decimal places): %.4f kg%n", marsWeightDoubleGay);

        marsWeightIntGay = (int) marsWeightDoubleGay;
        System.out.println("Kilograms on Mars cast to int: " + marsWeightIntGay);

        marsWeightCharGay = (char) marsWeightIntGay;
        System.out.println("Kilograms on Mars cast to char (ASCII): " + marsWeightCharGay);

        finalMathIntGay = marsWeightCharGay + 10;
        System.out.println("Char value after adding 10 and assigning to int: " + finalMathIntGay);
    }
}