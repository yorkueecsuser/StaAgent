import org.junit.Test;
import static org.junit.Assert.*;

public class LossyPrimitiveCompareExampleTest {

    @Test
    public void testShowBug() {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        assertEquals(0, example.showBug()); // TRIGGER BUG: LossyPrimitiveCompare
    }
}