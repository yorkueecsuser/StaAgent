import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class OptionalBugExampleTest {

    @Test
    public void testShowBug() {
        OptionalBugExample example = new OptionalBugExample();
        Optional<String> result = example.showBug("test"); // TRIGGER BUG: "null" should not be used with "Optional"

        // This line is intended to fail because result should be empty due to the bug
        assertTrue(result.isPresent()); // TRIGGER BUG: "null" should not be used with "Optional"
    }
}