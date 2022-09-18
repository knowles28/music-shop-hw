import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Guitar guitar;
    Guitar guitar2;
    GuitarStrings guitarStrings;

    Shop shop;

    Customer customer1;

    @Before
    public void setUp() {
        guitar = new Guitar(InstrumentType.STRING,100.00,500.00,"Cherry Sunburst", GuitarType.ELECTRIC, 6);
        guitar2 = new Guitar(InstrumentType.STRING,250.00,600.00,"Oak", GuitarType.ACOUSTIC, 6);
        guitarStrings = new GuitarStrings(2.00,6.00, guitar);
        shop = new Shop(1000);
        customer1 = new Customer("Keith", "keith@cc.com", "bagpipes");

    }


    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void getTillTotal() {
        assertEquals(1000, shop.getTillTotal(), 0.0);
    }

    @Test
    public void canSetTill() {
        shop.setTill(1200);
        assertEquals(1200,shop.getTillTotal(), 0.0);
    }

    @Test
    public void stockLevelStartsEmpty() {
        assertEquals(0,shop.getStockSize());
    }

    @Test
    public void canAddInstrumentToStockLevel() {
        shop.buyStockItem(guitar);
        assertEquals(1,shop.getStockSize());
    }

    @Test
    public void canAddAccessoryToStockLevel() {
        shop.buyStockItem(guitarStrings);
        assertEquals(1,shop.getStockSize());
    }

    @Test
    public void buyingStockReducesTillTotal() {
        shop.buyStockItem(guitar);
        assertEquals(900, shop.getTillTotal(), 0.0);
    }

    @Test
    public void canRemoveFromStockLevel() {
        shop.buyStockItem(guitar);
        shop.buyStockItem(guitarStrings);
        shop.sellStockItem(guitarStrings);
        assertEquals(1,shop.getStockSize());

    }

    @Test
    public void sellingStockIncreasesTillTotal() {
        shop.buyStockItem(guitar);
        shop.buyStockItem(guitar2);
        shop.sellStockItem(guitar);
        assertEquals(1150, shop.getTillTotal(), 0.0);

    }

    @Test
    public void canCalculateProfitFromCurrentStock(){
        shop.buyStockItem(guitar);
        shop.buyStockItem(guitar2);
        shop.buyStockItem(guitarStrings);
        assertEquals(754, shop.calculateProfitFromCurrentStock(),0.0);
    }


    @Test
    public void canAddCustomerToCustomerDB(){
        shop.addCustomerToCustomerDB(001, customer1);
        assertEquals(1, shop.getCustomerDB().size());

    }

    @Test
    public void canGetCustomersFavouriteInstrument(){
        shop.addCustomerToCustomerDB(001, customer1);
        assertEquals("Favourite instrument: bagpipes", shop.getCustomersFavouriteInstrument(001));
    }

    @Test
    public void cannotGetCustomersFavouriteInstrumentIfNotInDB(){
        shop.addCustomerToCustomerDB(1001, customer1);
        assertEquals("Sorry, customer number 1002 is not in the database", shop.getCustomersFavouriteInstrument(1002));
    }

}


