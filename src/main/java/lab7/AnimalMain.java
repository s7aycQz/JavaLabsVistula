package lab7;

public class AnimalMain {
    public static void main(String[] args) {

        Animals[] zoo = new Animals[6];

        zoo[0] = new Mammal("Leo", 5, 190.5, "Carnivora");
        zoo[1] = new Dog("Rex", "German Shepherd");
        zoo[2] = new Bird("Tweety", 2, 0.5, "Yellow");
        zoo[3] = new Pigeon("Pablo", "Rock Dove");
        zoo[4] = new Fish();
        zoo[5] = new Blowfish("Mrs. Puff", 4, 1.2, "Spotted", 25);

        System.out.println("--- Calling Methods on Individual Indexes ---");
        zoo[0].eat("meat");
        System.out.println("Dog says: " + zoo[1].getVoice());
        zoo[3].eat("seeds");
        System.out.println("Blowfish says: " + zoo[5].getVoice());

        ((Dog) zoo[1]).fetch();
        ((Pigeon) zoo[3]).deliverLetter();
        ((Blowfish) zoo[5]).inflate();

        System.out.println("\n--- All Animals in the Array ---");
        for (Animals a : zoo) {
            System.out.println(a);
        }
    }
}