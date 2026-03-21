import org.junit.Test;
import static org.junit.Assert.*;

public class FrobnicatorTest {
    @Test
    public void testEqualsWrongThing() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        boolean equalsResult = f1.equals(f2);
        assertFalse(equalsResult); // TRIGGER BUG: EqualsWrongThing
    }
}