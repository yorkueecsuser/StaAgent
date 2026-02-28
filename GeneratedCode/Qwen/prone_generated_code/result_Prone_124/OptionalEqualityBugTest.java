import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class OptionalEqualityBugTest {

    @Test
    public void testShowBugWithSameValueOptionals() {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        assertFalse(bugDemo.showBug(optional1, optional2)); // TRIGGER BUG: OptionalEquality
    }

    @Test
    public void testShowBugWithDifferentValueOptionals() {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("World");
        
        assertFalse(bugDemo.showBug(optional1, optional2)); // TRIGGER BUG: OptionalEquality
    }

    @Test
    public void testShowBugWithEmptyOptionals() {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.empty();
        
        assertFalse(bugDemo.showBug(optional1, optional2)); // TRIGGER BUG: OptionalEquality
    }
}