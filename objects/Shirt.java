package objects;

public class Shirt extends Product implements discountable{
    public enum Size{
        SMALL, MEDIUM, LARGE
    }
    private Size size;

    // Constr.
    public Shirt(Size size, String brand, String color, double price) {
        super(brand, color, price);
        this.size = size;
    }
    // Copy Constr.
    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }

    // Get n Set
    public Size getSize() {
        return this.size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void discount() {
        super.setPrice(super.getPrice() * 0.66);
        
    }

    // toString
    public String toString(){
        return  "\nSize: " + this.getSize() +
                "\nBrand: " + super.getBrand() +
                "\nColor: " + super.getColor() +
                "\nPrice: " + super.getPrice();
    }

}
