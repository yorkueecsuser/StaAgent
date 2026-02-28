import org.junit.Test;
import static org.junit.Assert.*;

public class ComputeIfAbsentExampleTest {

    @Test
    public void testShowBugWithAmbiguousConstructor() {
        ComputeIfAbsentExample example = new ComputeIfAbsentExample();
        long result = example.showBug(1L); // TRIGGER BUG: ComputeIfAbsentAmbiguousReference
        assertEquals(2, result); // This assertion will fail due to the bug
    }
}