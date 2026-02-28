import org.junit.Test;
import static org.junit.Assert.*;

public class ComputeIfAbsentAmbiguousReferenceExampleTest {
    ComputeIfAbsentAmbiguousReferenceExample example = new ComputeIfAbsentAmbiguousReferenceExample();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: ComputeIfAbsentAmbiguousReference
        // Here we call the method showBug twice, expecting the result to be 2
        assertEquals(1, example.showBug());
        assertEquals(2, example.showBug());
    }
}