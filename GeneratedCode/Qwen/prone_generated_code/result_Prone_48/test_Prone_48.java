import org.junit.Test;
import static org.junit.Assert.*;

public class FrobnicatorTest {

    @Test
    public void testEqualsWithDifferentBValues() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 1);
        assertFalse(f1.showBug(f2)); // TRIGGER BUG: EqualsWrongThing
    }

    @Test
    public void testEqualsWithSameAValuesButDifferentBValues() {
        Frobnicator f1 = new Frobnicator(5, 10);
        Frobnicator f2 = new Frobnicator(5, 20);
        assertFalse(f1.showBug(f2)); // TRIGGER BUG: EqualsWrongThing
    }
}