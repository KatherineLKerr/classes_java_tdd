import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume100AtStart() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkRemoves10FromVolume() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canEmptyWaterBottle() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFillWaterBottle() {
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}