package objects;

public abstract class Product implements Comparable<Product> {
    private String brand;
    private String color;
    private double price;

    // Constr.
    public Product(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    // Copy Constr.
    public Product(Product source){
        this.brand = source.brand;
        this.color = source.color;
        this.price = source.price;
    }

    // Get n Set
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Comparable override
    @Override
    public int compareTo(Product specifiedObject) {
        // TODO Auto-generated method stub
        return (int)Math.round(this.getPrice() - specifiedObject.getPrice());
    }

}
