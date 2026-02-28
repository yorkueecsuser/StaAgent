import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugTest {

    @Test
    public void testShowBug() {
        CompareToBug.showBug(); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        // The test should not pass if the bug is not triggered
    }
}