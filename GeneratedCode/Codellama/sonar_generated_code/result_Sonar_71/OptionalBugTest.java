import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugTest {

    @Test
    public void testBug() {
        Optional<String> optional = Optional.of("hello");
        String value = optional.get(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
        assertEquals("hello", value);
    }
}