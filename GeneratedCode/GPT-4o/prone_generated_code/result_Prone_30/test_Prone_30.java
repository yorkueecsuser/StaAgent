import org.junit.Test;
import static org.junit.Assert.*;

public class NullHostileExampleTest {

    @Test
    public void testShowBugWithNull() {
        NullHostileExample example = new NullHostileExample();
        example.showBug(null); // TRIGGER BUG: DangerousLiteralNull
    }

    @Test
    public void testShowBugWithNonNull() {
        NullHostileExample example = new NullHostileExample();
        int result = example.showBug("Hello, World!");
        assertEquals(13, result);
    }
}