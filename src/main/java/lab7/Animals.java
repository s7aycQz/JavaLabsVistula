package lab7;

public abstract class Animals {
    private String name;
    private int age;
    private double weight;

    public Animals() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animals(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animals(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1.0;
    }

    public abstract void eat(String food);
    public abstract String getVoice();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString() {
        return "name='" + name + "', age=" + age + ", weight=" + weight;
    }
}