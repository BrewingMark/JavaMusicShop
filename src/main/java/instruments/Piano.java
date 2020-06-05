package instruments;

import instruments.properties.Colour;
import instruments.properties.Material;
import instruments.properties.PianoType;
import instruments.properties.Type;

public class Piano extends Instrument{

    private PianoType pianoType;

    public Piano(double costPrice, double sellPrice, Colour colour, Material material, Type type, PianoType pianoType) {
        super(costPrice, sellPrice, colour, material, type);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play(){
        return "Plink!";
    }
}
