import org.junit.Test;
import static org.junit.Assert.*;

public class BadlyOverriddenAdapterTest {
    @Test
    public void testActionPerformed() {
        // TRIGGER BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        BadlyOverriddenAdapter adapter = new BadlyOverriddenAdapter();
        adapter.actionPerformed(null);
        fail("Expected exception");
    }
}