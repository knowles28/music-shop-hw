import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    Guitar guitar;
    Guitar guitar2;

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitar = new Guitar(InstrumentType.STRING,50.00,200.00,"Cherry Sunburst", GuitarType.ELECTRIC, 6);
        guitar2 = new Guitar(InstrumentType.STRING,100.00,500.00,"New Wave Blue", GuitarType.ELECTRIC, 6);
        guitarStrings = new GuitarStrings(2.00,6.00, guitar);

    }

    @Test
    public void getPurchasePrice() {
        assertEquals(2.00, guitarStrings.getPurchasePrice(), 0.0);
    }

    @Test
    public void getSalePrice() {
        assertEquals(6.00, guitarStrings.getSalePrice(), 0.0);
    }

    @Test
    public void setSalePrice() {
        guitarStrings.setSalePrice(10.00);
        assertEquals(10.00, guitarStrings.getSalePrice(), 0.0);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(4.00, guitarStrings.calculateMarkup(),0.0);
    }

    @Test
    public void getAssociatedInstrument() {
        assertEquals(guitar, guitarStrings.getAssociatedInstrument());
    }

    @Test
    public void setAssociatedInstrument() {
        guitarStrings.setAssociatedInstrument(guitar2);
        assertEquals(guitar2, guitarStrings.getAssociatedInstrument());

    }

}