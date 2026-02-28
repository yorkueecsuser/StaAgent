import org.junit.Test;
import static org.junit.Assert.*;

public class FrobnicatorTest {

    @Test
    public void testEqualsWithSameValues() {
        Frobnicator frobnicator1 = new Frobnicator(1, 2);
        Frobnicator frobnicator2 = new Frobnicator(1, 2);
        assertTrue(frobnicator1.showBug(frobnicator2)); // TRIGGER BUG: EqualsWrongThing
    }

    @Test
    public void testEqualsWithDifferentSecondField() {
        Frobnicator frobnicator1 = new Frobnicator(1, 2);
        Frobnicator frobnicator3 = new Frobnicator(1, 3);
        assertFalse(frobnicator1.showBug(frobnicator3)); // TRIGGER BUG: EqualsWrongThing
    }
}