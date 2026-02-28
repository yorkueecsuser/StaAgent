import org.junit.Test;
import static org.junit.Assert.*;

public class NullTernaryExampleTest {

    @Test
    public void testShowBugWithFalseFlag() {
        NullTernaryExample example = new NullTernaryExample();
        int result = example.showBug(false); // TRIGGER BUG: NullTernary
    }

    @Test
    public void testShowBugWithTrueFlag() {
        NullTernaryExample example = new NullTernaryExample();
        int result = example.showBug(true); // This should not trigger the bug
        assertEquals(10, result);
    }
}