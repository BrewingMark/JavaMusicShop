package Instruments;

import instruments.properties.Colour;
import instruments.Guitar;
import instruments.properties.Material;
import instruments.properties.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100.00, 150.00, Colour.ORANGE, Material.WOOD, Type.STRING, 6);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(100.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(150.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals(Colour.ORANGE, guitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, guitar.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals(Type.STRING, guitar.getType());
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Strummm!", guitar.play());
    }
}
