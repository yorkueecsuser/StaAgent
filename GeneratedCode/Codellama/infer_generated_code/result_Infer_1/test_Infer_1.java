import org.junit.Test;
import static org.junit.Assert.*;

public class LockExampleTest {
    @Test
    public void testExampleOfBadPattern() {
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
        // TRIGGER BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }
}