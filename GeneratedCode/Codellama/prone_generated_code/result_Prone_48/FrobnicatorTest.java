import org.junit.Test;
import static org.junit.Assert.*;

public class FrobnicatorTest {
    @Test
    public void testEquals() {
        Frobnicator frob1 = new Frobnicator(1, 2);
        Frobnicator frob2 = new Frobnicator(1, 3);
        assertTrue(frob1.equals(frob2)); // TRIGGER BUG: EqualsWrongThing
    }
}