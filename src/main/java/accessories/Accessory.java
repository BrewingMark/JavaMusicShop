package accessories;

import behaviors.ISell;

public abstract class Accessory implements ISell {

    private double costPrice;
    private double sellPrice;
    private String name;

    public Accessory(double costPrice, double sellPrice, String name) {
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public String getDescription() {
        return this.name;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.costPrice;
    }
}
