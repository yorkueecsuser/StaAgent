import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class OptionalEqualityExampleTest {

    @Test
    public void testShowBugDifferentOptionals() {
        OptionalEqualityExample example = new OptionalEqualityExample();
        Optional<String> opt1 = Optional.of("Hello");
        Optional<String> opt2 = Optional.of("Hello");

        // Test case should fail, triggering the bug
        assertFalse(example.showBug(opt1, opt2)); // TRIGGER BUG: OptionalEquality
    }

    @Test
    public void testShowBugSameOptional() {
        OptionalEqualityExample example = new OptionalEqualityExample();
        Optional<String> opt1 = Optional.of("Hello");

        // Test case should pass because both references point to the same Optional instance 
        assertTrue(example.showBug(opt1, opt1)); // TRIGGER BUG: OptionalEquality
    }
}