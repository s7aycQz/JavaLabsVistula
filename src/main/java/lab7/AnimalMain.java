package lab7;

public class AnimalMain {
    public static void main(String[] args) {
        Animals[] zoo = new Animals[6];
        zoo[0] = new Mammal("Leo", 5, 190.5, "Carnivora");
        zoo[1] = new Dog("Rex", "German Shepherd");
        zoo[2] = new Bird("Tweety", 2, 0.5, "Yellow");
        zoo[3] = new Pigeon("Pablo", "Rock Dove");
        zoo[4] = new Fish("Nemo", "Orange");
        zoo[5] = new Blowfish("Mrs. Puff", 4, 1.2, "Spotted", 25);

        System.out.println("--- AnimalMove: move() ---");
        for (Animals a : zoo) {
            a.move();
        }

        System.out.println("\n--- AnimalName: name() ---");
        for (Animals a : zoo) {
            AnimalName.name(a.getName());
        }

        System.out.println("\n--- AnimalBehavior: sleep() ---");
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Buddy", "Labrador");
        behaviors[1] = new Pigeon("Sky", "Homing Pigeon");
        behaviors[2] = new Blowfish("Spike", 15);

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();
    }
}