import org.junit.Test;
import static org.junit.Assert.*;

public class FrobnicatorTest {

    @Test
    public void testEqualsMethod() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        // TRIGGER BUG: EqualsWrongThing - the bug is triggered because `b` of `f1` is not equal to `b` of `f2`,
        // but the equals method is comparing `b` of `f1` with `a` of `f2`, which are not the same fields
        assertTrue(f1.showBug());
    }
}