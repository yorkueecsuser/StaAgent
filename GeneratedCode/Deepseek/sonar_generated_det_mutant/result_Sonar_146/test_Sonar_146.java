import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionsAsArgumentsTest {

    @Test
    public void testCollectionsAsArguments() {
        CollectionsAsArguments obj = new CollectionsAsArguments();
        try {
            obj.showBug(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
            fail("Expected an Exception");
        } catch (StackOverflowError e) {
            // Expected exception
        }
    }
}