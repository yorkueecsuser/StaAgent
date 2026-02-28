import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTestCaseTest {

    @Test
    public void testShowBug() {
        VehicleTestCase vtc = new VehicleTestCase();
        assertEquals("This is not a test case but has a misleading name.", vtc.showBug()); // TRIGGER BUG: TestClassWithoutTestCases
    }
}