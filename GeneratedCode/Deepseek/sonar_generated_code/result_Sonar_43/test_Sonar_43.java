import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        Main obj = new Main();
        try {
            obj.showBug(); // TRIGGER BUG: Regular expressions should be syntactically valid
            fail("Expected an IllegalArgumentException to be thrown"); // This line will not be reached if an exception is thrown
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

}