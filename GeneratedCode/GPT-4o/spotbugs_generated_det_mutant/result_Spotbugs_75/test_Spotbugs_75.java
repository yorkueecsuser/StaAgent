import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullExampleTest {

    @Test
    public void testShowBugWithNull() {
        EqualsNullExample example = new EqualsNullExample();
        assertTrue(example.showBug(null)); // TRIGGER BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}