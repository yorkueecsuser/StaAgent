import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileCompoundOperatorsTest {
    private VolatileCompoundOperators obj = new VolatileCompoundOperators();

    @Test // TRIGGER BUG: "volatile" variables should not be used with compound operators
    public void testIncrementCount() {
        obj.incrementCount();
    }

    @Test // TRIGGER BUG: "volatile" variables should not be used with compound operators
    public void testToggleBoo() {
        obj.toggleBoo();
    }
}