package lab7;

public class Bird extends Animals {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Grey";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the bird is pecking at " + food);
    }

    @Override
    public String getVoice() {
        return "Chirp! Chirp!";
    }

    public void fly() {
        System.out.println(getName() + " is flying in the sky.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + ", featherColor='" + featherColor + "'}";
    }
}
