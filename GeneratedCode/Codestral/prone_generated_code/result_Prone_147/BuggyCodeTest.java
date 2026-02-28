import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        Optional<String> optional = Optional.empty();
        // TRIGGER BUG: ReturnValueIgnored
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }
}