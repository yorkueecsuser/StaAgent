import org.junit.Test;
import static org.junit.Assert.*;

public class OctalBugExampleTest {

    @Test
    public void testShowBug() {
        OctalBugExample example = new OctalBugExample();
        int result = example.showBug(); // TRIGGER BUG: AvoidUsingOctalValues
        assertEquals(120, result); // This assertion will fail because the actual result is 80 due to the bug
    }
}