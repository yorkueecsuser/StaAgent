import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableBugTest {
    @Test
    public void testImmutableBug() {
        ImmutableBug immutableBug = new ImmutableBug(new java.util.ArrayList<>(java.util.Arrays.asList("Element1", "Element2")));
        immutableBug.showBug();
        assertNotEquals("New Element", immutableBug.getMutableField().get(immutableBug.getMutableField().size() - 1));
        // TRIGGER BUG: Immutable - the test should fail as we're trying to modify a mutable field in an immutable object
    }
}