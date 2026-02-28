import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class ComputeIfAbsentAmbiguousReferenceBugTest {
    @Test
    public void testShowBug() {
        ComputeIfAbsentAmbiguousReferenceBug buggyClass = new ComputeIfAbsentAmbiguousReferenceBug();
        Long key = 123L;
        long result = buggyClass.showBug(key);
        assertNotEquals(key.longValue(), result);
    }
}