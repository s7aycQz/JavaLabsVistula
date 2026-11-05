package lab7;

public class Pigeon extends Bird implements AnimalBehavior{
    private String species;

    public Pigeon() {
        super();
        this.species = "City Pigeon";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Grey");
        this.species = species;
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Pigeon is sleeping on a tree branch.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies in the sky.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the pigeon is eating breadcrumbs and " + food);
    }

    @Override
    public String getVoice() {
        return "Coo! Coo!";
    }

    public void deliverLetter() {
        System.out.println(getName() + " is delivering a secret message.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species='" + species + "'}";
    }
}