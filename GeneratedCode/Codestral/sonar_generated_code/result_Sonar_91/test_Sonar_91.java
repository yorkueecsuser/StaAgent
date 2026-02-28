import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class OptionalNullBugTest {
    @Test
    public void testShowBug() {
        OptionalNullBug buggyObject = new OptionalNullBug();
        Optional<String> optionalStr = buggyObject.showBug(); // TRIGGER BUG: "null" should not be used with "Optional"
        assertFalse(optionalStr.isPresent()); // this line will fail because the Optional was created with a null value
    }
}