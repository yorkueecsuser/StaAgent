import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnValueIgnoredTest {
    @Test
    public void testMain() {
        ReturnValueIgnored.main(null);
        // TRIGGER BUG: ReturnValueIgnored
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
        assertFalse(optional.isPresent());
    }
}