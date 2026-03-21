import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testShowBug() {
        MainClass mc = new MainClass();
        // TRIGGER BUG: "@NonNull" values should not be set to null
        assertNotNull(mc.showBug());
    }

    @Test
    public void testShowBug1() {
        MainClass mc = new MainClass("red");
        // TRIGGER BUG: "@NonNull" values should not be set to null
        assertNotNull(mc.showBug1());
    }

    @Test
    public void testShowBug2() {
        MainClass mc = new MainClass();
        // TRIGGER BUG: return value is Nonnull, but null is returned.
        assertNotNull(mc.showBug2());
    }
}