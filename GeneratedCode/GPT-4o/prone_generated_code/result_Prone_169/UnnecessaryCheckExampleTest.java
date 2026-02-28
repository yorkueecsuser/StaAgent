import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryCheckExampleTest {

    @Test
    public void testShowBugWithNonNullInput() {
        UnnecessaryCheckExample example = new UnnecessaryCheckExample();
        String result = example.showBug("hello");
        assertEquals("HELLO", result);
    }

    @Test
    public void testShowBugWithNullInput() {
        UnnecessaryCheckExample example = new UnnecessaryCheckExample();
        String result = example.showBug(null); // TRIGGER BUG: UnnecessaryCheckNotNull
        assertEquals("default", result); // This will fail if bug is not fixed
    }
}