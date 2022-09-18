import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Keith", "keith@cc.com", "guitar");
    }

    @Test
    public void getName() {
        assertEquals("Keith", customer.getName());
    }

    @Test
    public void getEmail() {
        assertEquals("keith@cc.com", customer.getEmail());

    }

    @Test
    public void getFavouriteInstrument() {
        assertEquals("guitar", customer.getFavouriteInstrument());
    }


}