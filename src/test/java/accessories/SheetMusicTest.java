package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(10.00, 60.00, "Pedestrian Verse", "Scott Hutchison");
    }

    @Test
    public void hasCostPrice(){
        assertEquals(10.00, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(60.00, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMargin(){
        assertEquals(50.00, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void hasName(){
        assertEquals("Pedestrian Verse", sheetMusic.getName());
    }

    @Test
    public void hasComposer(){
        assertEquals("Scott Hutchison", sheetMusic.getComposer());
    }

}
