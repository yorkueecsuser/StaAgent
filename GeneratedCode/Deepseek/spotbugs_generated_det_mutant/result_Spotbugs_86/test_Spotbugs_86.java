import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest { // Renamed the class to MainTest
    @Test // Added the @Test annotation
    public void testShowBug() {
        assertEquals("BIT_AND_ZZ", 0, Main.showBug(10)); // Triggers the bug by comparing the return value to 0.
    }
}