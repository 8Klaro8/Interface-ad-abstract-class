package objects;

import javax.sound.midi.Soundbank;

public class Pants extends Product implements discountable {
    private int waist;

    // Constr.
    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }

    // Copy Constr.
    public Pants(Pants source) {
        super(source);
        this.waist = source.waist;
    }

    // Get n Set
    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants)obj;
        return this.getWaist() == pants.getWaist() &&
                super.getBrand().equalsIgnoreCase(pants.getBrand()) &&
                super.getColor().equalsIgnoreCase(pants.getColor()) &&
                super.getPrice() == pants.getPrice();
    }

    @Override
    public void discount() {
        super.setPrice(super.getPrice() * 0.8);
    }

    // toString
    public String toString(){
        return  "PANTS" +
                "\t" + this.getWaist() +
                "\t" + super.getBrand() +
                "\t" + super.getColor() +
                "\t" + super.getPrice();
    }

}
