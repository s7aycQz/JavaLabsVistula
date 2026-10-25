package Lab4;


class Car {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void delivery(int amount) {
        this.quantity += amount;
        System.out.println("Delivered " + amount + " cars. New quantity: " + this.quantity);
    }

    public void sell(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount;
            System.out.println("Sold " + amount + " cars. Remaining quantity: " + this.quantity);
        } else {
            System.out.println("Not enough cars in stock!");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class CarDemo {
    public static void main(String[] args) {

        Car myCar = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(myCar.toString());

        myCar.sell(2);

        System.out.println("Model: " + myCar.getModel());
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        myCar.setColor("black");
        myCar.setPrice(330000);
        myCar.delivery(3);

        System.out.println(myCar.toString());
    }
}