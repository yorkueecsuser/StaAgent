import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class OptionalEqualityBugTest {
    OptionalEqualityBug bugObject = new OptionalEqualityBug();

    @Test
    public void testShowBug() {
        Optional<String> opt1 = Optional.of("test");
        Optional<String> opt2 = Optional.of("test");
        assertTrue(bugObject.showBug(opt1, opt2)); // TRIGGER BUG: OptionalEquality
    }
}