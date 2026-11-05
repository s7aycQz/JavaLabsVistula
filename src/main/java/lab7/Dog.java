package lab7;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String name, int age, double weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Carnivora");
        this.breed = breed;
    }

    @Override
    public void sleep(){
        System.out.println(getName() + "the Dog is sleeping in its kennel");
    }
    @Override
    public void move(){
        System.out.println("Dog runs on four legs.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the dog is crunching on " + food);
    }

    @Override
    public String getVoice() {
        return "Woof! Woof!";
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}