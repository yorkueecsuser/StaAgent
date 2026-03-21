import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ExposeInternalStateTest {

    @Test
    public void testShowBug() {
        List<String> external = new ArrayList<>();
        external.add("Initial Value");

        // Initialize the internal list with the external list
        ExposeInternalState.initializeList(external); // TRIGGER BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

        // Modify the external list
        external.add("Modified Value");

        // Demonstrate that the internal state has been modified
        List<String> internalState = ExposeInternalState.showBug();

        // Assertion to trigger the bug: the internal state should not reflect changes in external list
        assertEquals("The internal state should not be affected by external modifications", 1, internalState.size());
    }
}