import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugTest {
    private VolatileBug volatileBug = new VolatileBug();

    @Test
    public void testIncrementCount() {
        volatileBug.incrementCount();
        // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertEquals(1, volatileBug.showBug()); // This should fail, because the incrementCount() method is buggy
    }

    @Test
    public void testToggleBoo() {
        volatileBug.toggleBoo();
        // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertTrue(volatileBug.showBug()!= 0); // This should fail, because the toggleBoo() method is buggy
    }
}