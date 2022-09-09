package pkg;

public class Car_detail {
    private int price, date;
    private String color, model;

    public Car_detail(int date, int price, String color, String model) {
        this.date = date;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car price= %d, date= %d, color= %s, model= %s".formatted(price, date, color, model);
    }
}
