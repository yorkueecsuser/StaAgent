import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsSymmetryBugTest {

    @Test
    public void testEqualsSymmetryBug() {
        EqualsSymmetryBug demo = new EqualsSymmetryBug();
        assertFalse(demo.showBug()); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
    }
}