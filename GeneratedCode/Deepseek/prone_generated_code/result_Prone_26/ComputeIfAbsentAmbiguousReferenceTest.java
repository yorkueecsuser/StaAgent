import org.junit.Test;
import static org.junit.Assert.*;

public class ComputeIfAbsentAmbiguousReferenceTest {
    private ComputeIfAbsentAmbiguousReference bug = new ComputeIfAbsentAmbiguousReference();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: ComputeIfAbsentAmbiguousReference
        bug.showBug(10);
        assertEquals("The AtomicLong should not be initialized with the key value", 1, bug.showBug(10));
    }
}