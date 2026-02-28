import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        B bInstance = new B();
        int result = bInstance.showBug(); // TRIGGER BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
        assertEquals(17, result); // Expecting superclass method to be called, but subclass method is called instead
    }
}