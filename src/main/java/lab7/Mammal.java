package lab7;

public class Mammal extends Animals{
    private String order;

    public Mammal(){
        super();
        this.order = "Unknown";
    }

    public Mammal(String name, int age, double weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal (String name, String order){
        super(name);
        this.order = order;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the mammal is eating" + food + ".");
    }

    @Override
    public String getVoice() {
        return "Generic Mammal sound";
    }

    public void drinkMilk() {
        System.out.println(getName() + " is drinking milk.");
    }

    public String getOrder() { return order;}
    public void setOrder(String order) { this.order = order; }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", order='" + order + "'}";
    }




}
