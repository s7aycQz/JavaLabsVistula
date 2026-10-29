package lab7;

public class Blowfish extends Fish {
    private int diameter;

    public Blowfish() {
        super();
        this.diameter = 10;
    }

    public Blowfish(String name, int age, double weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(String name, int diameter) {
        super(name, "Yellow");
        this.diameter = diameter;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the blowfish snacks on " + food);
    }

    @Override
    public String getVoice() {
        return "Puff! Blub!";
    }

    public void inflate() {
        System.out.println(getName() + " inflated to " + diameter + " cm!");
    }

    public int getDiameter() { return diameter; }
    public void setDiameter(int diameter) { this.diameter = diameter; }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", diameter=" + diameter + "}";
    }
}
