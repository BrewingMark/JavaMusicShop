package accessories;

import behaviors.ISell;

import java.lang.ref.SoftReference;

public abstract class Accessory implements ISell {

    private double costPrice;
    private double sellPrice;
    private String description;

    public Accessory(double costPrice, double sellPrice, String name) {
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.description = name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }
}
