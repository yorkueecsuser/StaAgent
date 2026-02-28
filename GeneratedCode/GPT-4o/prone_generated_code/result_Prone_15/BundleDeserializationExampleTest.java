import org.junit.Test;
import static org.junit.Assert.*;

public class BundleDeserializationExampleTest {

    @Test
    public void testShowBug_TriggerBug() {
        // This test is designed to trigger the bug in the showBug method
        // The following line will throw a ClassCastException because of the bug
        String result = BundleDeserializationExample.showBug(); // TRIGGER BUG: BundleDeserializationCast
        // The assertion below is unreachable due to the exception
        assertEquals("Hello World", result);
    }
}