import org.junit.Test;
import static org.junit.Assert.*;

public class IncrementBugExampleTest {

    @Test
    public void testPickNumber() {
        IncrementBugExample example = new IncrementBugExample();
        assertEquals(0, example.pickNumber()); // TRIGGER BUG: Values should not be uselessly incremented
    }

    @Test
    public void testShowBug1() {
        IncrementBugExample example = new IncrementBugExample();
        assertEquals(0, example.showBug1()); // TRIGGER BUG: Values should not be uselessly incremented
    }

    @Test
    public void testShowBug2() {
        IncrementBugExample example = new IncrementBugExample();
        assertEquals(0, example.showBug2()); // TRIGGER BUG: Values should not be uselessly incremented
    }
}