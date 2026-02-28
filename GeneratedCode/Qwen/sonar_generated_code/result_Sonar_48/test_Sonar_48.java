import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class AssertJBugExampleTest {

    @Test
    public void testShowBug1WithEmptyList() {
        AssertJBugExample example = new AssertJBugExample();
        assertFalse(example.showBug1(Arrays.asList())); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }

    @Test
    public void testShowBug2WithEmptyList() {
        AssertJBugExample example = new AssertJBugExample();
        assertTrue(example.showBug2(Arrays.asList())); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }
}