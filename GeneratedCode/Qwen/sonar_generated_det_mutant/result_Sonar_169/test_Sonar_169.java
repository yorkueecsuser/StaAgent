import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsBugExampleTest {

    @Test
    public void testEqualsWithSameId() {
        EqualsBugExample example1 = new EqualsBugExample(1);
        EqualsBugExample example2 = new EqualsBugExample(1);
        assertTrue(example1.showBug(example1, example2)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithDifferentId() {
        EqualsBugExample example1 = new EqualsBugExample(1);
        EqualsBugExample example3 = new EqualsBugExample(2);
        assertFalse(example1.showBug(example1, example3)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithNull() {
        EqualsBugExample example1 = new EqualsBugExample(1);
        assertFalse(example1.showBug(example1, null)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }
}