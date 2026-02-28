import org.junit.Test;
import static org.junit.Assert.*;

public class BadlyOverriddenAdapterExampleTest {

    @Test
    public void testShowBug() {
        BadlyOverriddenAdapterExample example = new BadlyOverriddenAdapterExample();
        example.showBug(); // TRIGGER BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        
        // To demonstrate the failure, we expect the "Badly overridden actionPerformed method."
        // to be printed, but it won't be, as the listener is not set up to use BadlyOverriddenAdapter.
        // So, we simulate this by asserting false to mimic the failure.
        assertFalse("Expected 'Badly overridden actionPerformed method.' but it was never called.", true); // TRIGGER BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
    }
}