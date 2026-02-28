import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testFinalizeMethodTriggersBug() {
        FinalizeExample example = new FinalizeExample();
        String result = example.showBug(); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
        assertNotNull(result);
        assertTrue(result.contains("Finalize method was called")); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
    }
}