import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testApplyConfigurationNoApply() {
        Main.Configuration configuration = new Main.Configuration();
        configuration.setComparingPrivateFields(true);
        // TRIGGER BUG: AssertJ configuration should be applied
        // BUG: AssertJ configuration should be applied
        fail("Expected UnsupportedOperationException");
    }
}