import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {
    @Test
    public void testConstructor() {
        // TRIGGER BUG: "@NonNull" values should not be set to null
        MainClass mc = new MainClass(null);
        assertNull(mc.primary);
    }

    @Test
    public void testIndirectMix() {
        // TRIGGER BUG: return value is Nonnull, but null is returned.
        MainClass mc = new MainClass("red");
        assertNull(mc.indirectMix());
    }
}