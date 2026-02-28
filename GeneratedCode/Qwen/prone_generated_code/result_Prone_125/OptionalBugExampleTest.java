import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class OptionalBugExampleTest {

    @Test
    public void testShowBugWithNonEmptyOptional() {
        OptionalBugExample example = new OptionalBugExample();
        assertEquals("HELLO", example.showBug(Optional.of("hello"))); // TRIGGER BUG: OptionalMapUnusedValue
    }

    @Test
    public void testShowBugWithEmptyOptional() {
        OptionalBugExample example = new OptionalBugExample();
        assertEquals("Default", example.showBug(Optional.empty())); // TRIGGER BUG: OptionalMapUnusedValue
    }
}