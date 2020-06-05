package instruments;

import instruments.properties.Colour;
import instruments.properties.Material;
import instruments.properties.Type;

public class Guitar extends Instrument {

    private int numOfStrings;

    public Guitar(double costPrice, double sellPrice, Colour colour, Material material, Type type, int numOfStrings) {
        super(costPrice, sellPrice, colour, material, type);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Strummm!";
    }
}
