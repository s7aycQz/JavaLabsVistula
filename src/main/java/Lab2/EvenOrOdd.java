package Lab2;

public class EvenOrOdd {
    public static void main(String[] args) {
        int randomNumberGay = (int) (Math.random() * 100) + 1;
        System.out.println("Generated random number between 1 and 100: " + randomNumberGay);

        if (randomNumberGay % 2 == 0) {
            System.out.println("Modulo check (% 2 == 0): The number " + randomNumberGay + " is EVEN.");
        } else {
            System.out.println("Modulo check (% 2 != 0): The number " + randomNumberGay + " is ODD.");
        }
    }
}