import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar(InstrumentType.STRING,50.00,200.00,"Cherry Sunburst", GuitarType.ELECTRIC, 6);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(50.00, guitar.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(200.00, guitar.getSalePrice(),0.0);
    }

    @Test
    public void canGetColour() {
        assertEquals("Cherry Sunburst", guitar.getColour());
    }

    @Test
    public void canSetSalePrice() {
        guitar.setSalePrice(210.00);
        assertEquals(210.00, guitar.getSalePrice(),0.0);

    }

    @Test
    public void canPlay() {
        assertEquals("Oh it's just a little song called Stairway To Heaven, have you heard of it?", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(150.00, guitar.calculateMarkup(),0.0);
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void canGetStringNumber() {
        assertEquals(6, guitar.getStringNumber());
    }


}