import org.junit.Test;
import static org.junit.Assert.*;

import java.util.logging.*;

public class IsLoggableTagLengthTest {

    IsLoggableTagLength isLoggableTagLength = new IsLoggableTagLength();

    @Test // TRIGGER BUG: IsLoggableTagLength
    public void testShowBug() {
        String tag = "ThisIsAVeryLongLogTagThatExceeds23Characters";
        try {
            isLoggableTagLength.showBug(tag);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // This test should pass because of the IllegalArgumentException
        } catch (Exception e) {
            fail("Expected an IllegalArgumentException to be thrown but got: " + e.getMessage());
        }
    }
}