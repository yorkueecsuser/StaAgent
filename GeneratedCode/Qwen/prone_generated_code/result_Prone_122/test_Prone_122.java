import org.junit.Test;
import static org.junit.Assert.*;

public class NullTernaryExampleTest {

    @Test
    public void testShowBugWithFalseFlag() {
        NullTernaryExample example = new NullTernaryExample();
        int result = example.showBug(false, 10); // TRIGGER BUG: NullTernary
        assertEquals(10, result);
    }

    @Test
    public void testShowBugWithTrueFlag() {
        NullTernaryExample example = new NullTernaryExample();
        int result = example.showBug(true, 10);
        assertEquals(10, result);
    }
}