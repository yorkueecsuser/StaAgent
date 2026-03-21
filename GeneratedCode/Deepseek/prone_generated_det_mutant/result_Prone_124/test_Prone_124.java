import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;

public class OptionalEqualityTest {
    @Test
    public void testOptionalEquality() {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        // TRIGGER BUG: OptionalEquality
        assertNotEquals(optional1, optional2); // This line triggers the bug
    }
}