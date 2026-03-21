import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testShowBug() {
        FinalizeExample example = new FinalizeExample("Test Resource");
        String result = example.showBug();
        assertNotNull(result); // Ensure the method returns a non-null value

        // TRIGGER BUG: FinalizeDoesNotCallSuperFinalize
        assertTrue("FinalizeExample created and eligible for GC. Check console for finalize execution.".equals(result));
    }
}