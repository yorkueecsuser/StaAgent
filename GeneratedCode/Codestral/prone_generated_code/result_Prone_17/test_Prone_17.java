import org.junit.Test;
import static org.junit.Assert.*;

public class CheckNotNullMultipleTimesBugTest {
    @Test
    public void testShowBug() {
        CheckNotNullMultipleTimesBug buggyClass = new CheckNotNullMultipleTimesBug();
        String result = buggyClass.showBug("test"); // TRIGGER BUG: CheckNotNullMultipleTimes
        assertNotNull("The method should not return null", result);
    }
}