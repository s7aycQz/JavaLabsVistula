package Lab2;

public class LegoContainers {
    public static void main(String[] args) {
        int amountOfBricksGay = 73; // Odd number between 50 and 100
        int containerCapacityGay = 8; // Even number between 5 and 10

        System.out.println("Total amount of Lego bricks: " + amountOfBricksGay);
        System.out.println("Single container capacity: " + containerCapacityGay);

        int fullContainersGay = amountOfBricksGay / containerCapacityGay;
        System.out.println("Number of FULL containers: " + fullContainersGay);

        int remainingBricksGay = amountOfBricksGay % containerCapacityGay;
        int totalContainersGay = (remainingBricksGay > 0) ? (fullContainersGay + 1) : fullContainersGay;

        System.out.println("Total number of containers (full and not full): " + totalContainersGay);
        System.out.println("Number of bricks in the incomplete container: " + remainingBricksGay);
    }
}