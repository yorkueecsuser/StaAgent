import org.junit.Test;
import static org.junit.Assert.*;

public class CarTestTest {

    @Test
    public void testShowBug() {
        CarTest carTest = new CarTest(); // TRIGGER BUG: TestClassWithoutTestCases
        assertEquals("Expected message", carTest.showBug()); // TRIGGER BUG: TestClassWithoutTestCases
    }
}