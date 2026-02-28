import org.junit.Test;
import static org.junit.Assert.*;

public class IncrementOverwriteBugTest {

    @Test
    public void testShowBug() {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        assertEquals(6, bugDemo.showBug(5)); // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    }

    @Test
    public void testShowBug2() {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        assertEquals(4, bugDemo.showBug2(5)); // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    }
}