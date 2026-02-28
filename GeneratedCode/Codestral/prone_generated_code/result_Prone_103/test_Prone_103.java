import org.junit.Test;
import static org.junit.Assert.*;

public class LossyPrimitiveCompareBugTest {
    @Test
    public void testShowBug() {
        LossyPrimitiveCompareBug buggyClass = new LossyPrimitiveCompareBug();

        // TRIGGER BUG: LossyPrimitiveCompare
        assertEquals("The test case should fail due to lossy comparison", -1, buggyClass.showBug());
    }
}