import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BuggyActivityTest {
    @Test // TRIGGER BUG: CallSuperFirst
    public void testInitialize() {
        BuggyActivity ba = new BuggyActivity();
        ba.showBug(); // This line triggers the bug
        ArrayList<String> expected = new ArrayList<>(Arrays.asList((String) null));
        assertEquals(expected, ba.showBug()); // This line will fail as the bug is not triggered
    }
}