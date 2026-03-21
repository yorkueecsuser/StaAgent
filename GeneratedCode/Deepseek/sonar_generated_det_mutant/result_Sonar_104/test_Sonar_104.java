import org.junit.Test;
import static org.junit.Assert.*;

public class AddressTest {
    @Test
    public void testAddressNotSerializable() {
        Address address = new Address();
        address.showBug();
        // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}