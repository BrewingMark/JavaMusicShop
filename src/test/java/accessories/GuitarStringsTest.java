package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(5.00, 15.00, "Fender pro guitar Strings");
    }

    @Test
    public void hasCostPrice(){
        assertEquals(5.00, guitarStrings.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15.00, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMargin(){
        assertEquals(10.00, guitarStrings.calculateMarkup(), 0.01);
    }

    @Test
    public void hasName(){
        assertEquals("Fender pro guitar Strings", guitarStrings.getName());
    }

}
