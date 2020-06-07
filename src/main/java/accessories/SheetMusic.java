package accessories;

public class SheetMusic  extends Accessory{

    private String composer;

    public SheetMusic(double costPrice, double sellPrice, String name, String composer) {
        super(costPrice, sellPrice, name);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }
}
