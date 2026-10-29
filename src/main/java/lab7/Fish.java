package lab7;

public class Fish extends Animals {
    private String scaleColor;

    public Fish() {
        super();
        this.scaleColor = "Silver";
    }

    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the fish is swallowing " + food);
    }

    @Override
    public String getVoice() {
        return "Blub... blub...";
    }

    public void swim() {
        System.out.println(getName() + " is swimming underwater.");
    }

    public String getScaleColor() { return scaleColor; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", scaleColor='" + scaleColor + "'}";
    }
}