package shop;

import behaviors.ISell;
import instruments.Guitar;
import instruments.properties.Colour;
import instruments.properties.Material;
import instruments.properties.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ISell item;

    @Before
    public void before(){
        shop = new Shop("Ray’s Music Exchange");
        item = new Guitar(125.00, 220.00, Colour.BLUE, Material.WOOD, Type.STRING, 6);
    }

    @Test
    public void hasName(){
        assertEquals("Ray’s Music Exchange", shop.getName());
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addStock(item);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(item);
        shop.removeStock(item);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addStock(item);
        shop.addStock(item);
        assertEquals(190.00, shop.calculatePotentialProfit(), 0.01);
    }

}
