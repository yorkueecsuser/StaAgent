import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AvoidCallingFinalizeTest {
    @Test
    public void testBug() {
        List<String> list = java.util.Arrays.asList("A", "B", "C");
        list.finalize(); // TRIGGER BUG: AvoidCallingFinalize
    }

    @Test
    public void testShowBug() {
        List<String> list = java.util.Arrays.asList("A", "B", "C");
        list.finalize(); // TRIGGER BUG: AvoidCallingFinalize
        assertNotNull(list.showBug());
    }
}

{
  "Trigger_Explanation": "The test case triggers the bug by calling the finalize() method on a list of strings created using Arrays.asList().",
  "Trigger_Line": [6, 17]
}