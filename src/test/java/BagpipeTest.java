import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagpipeTest {


    Bagpipes bagpipes;

    @Before
    public void setUp(){
        bagpipes = new Bagpipes(InstrumentType.WIND,50.00,200.00,"Tartan", 4);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.WIND, bagpipes.getInstrumentType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(50.00, bagpipes.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(200.00, bagpipes.getSalePrice(),0.0);
    }

    @Test
    public void canGetColour() {
        assertEquals("Tartan", bagpipes.getColour());
    }

    @Test
    public void canSetSalePrice() {
        bagpipes.setSalePrice(210.00);
        assertEquals(210.00, bagpipes.getSalePrice(),0.0);

    }

    @Test
    public void canPlay() {
        assertEquals("You're on the Royal Mile/Princes Street", bagpipes.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(150.00, bagpipes.calculateMarkup(),0.0);
    }


    @Test
    public void canGetPipeNumber() {
        assertEquals(4, bagpipes.getPipeNumber());
    }

}
