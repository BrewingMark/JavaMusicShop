package Instruments;

import instruments.Piano;
import instruments.properties.Colour;
import instruments.properties.Material;
import instruments.properties.PianoType;
import instruments.properties.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano(800.00, 1500.00, Colour.BLACK, Material.WOOD, Type.KEYBOARD, PianoType.GRAND);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(800.00, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1500.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals(Colour.BLACK, piano.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, piano.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void hasPianoTypes(){
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink!", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(700, piano.calculateMarkup(), 0.01);
    }

}
