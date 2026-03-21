import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    // TRIGGER BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
    public void testBugIsTriggered() {
        Main main = new Main();
        List<Integer> expectedValues = Arrays.asList(10);
        assertEquals(expectedValues, main.showBug());
    }
}