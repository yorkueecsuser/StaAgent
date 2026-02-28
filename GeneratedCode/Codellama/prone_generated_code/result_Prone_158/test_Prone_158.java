import org.junit.Test;
import static org.junit.Assert.*;

public class SuppressWarningsDeprecatedTest {
    @Test
    public void testMain() {
        // TRIGGER BUG: SuppressWarningsDeprecated
        SuppressWarningsDeprecated.main(new String[]{});
    }
}