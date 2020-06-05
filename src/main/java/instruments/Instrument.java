package instruments;

import behaviors.IPlay;
import instruments.properties.Colour;
import instruments.properties.Material;
import instruments.properties.Type;

public abstract class Instrument implements IPlay {

    private double costPrice;
    private double sellPrice;
    private Colour colour;
    private Material material;
    private Type type;

    public Instrument(double costPrice, double sellPrice, Colour colour, Material material, Type type) {
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public Colour getColour() {
        return colour;
    }

    public Material getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }
}
