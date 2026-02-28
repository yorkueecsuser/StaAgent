import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class MainTest {
    Main m = new Main();

    @Test
    public void testShowBug() {
        try {
            m.showBug();
        } catch (StackOverflowError e) {
            fail("StackOverflowError should not be thrown");
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getClass().getName());
        }
    }
}