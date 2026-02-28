import org.junit.Test;
import static org.junit.Assert.*;

public class LossyPrimitiveCompareTest {
    private LossyPrimitiveCompare lossyPrimitiveCompare = new LossyPrimitiveCompare();

    @Test
    // TRIGGER BUG: LossyPrimitiveCompare
    public void testShowBug() {
        assertEquals(1, lossyPrimitiveCompare.showBug()); // The expected result (1) is different from the actual result (0) so the test will fail
    }
}