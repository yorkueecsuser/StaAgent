import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class AssertJBugExampleTest {

    private AssertJBugExample example = new AssertJBugExample();

    @Test
    public void testShowBug1WithEmptyList() {
        assertFalse(example.showBug1(Arrays.asList())); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }

    @Test
    public void testShowBug2WithEmptyList() {
        assertTrue(example.showBug2(Arrays.asList())); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }
}