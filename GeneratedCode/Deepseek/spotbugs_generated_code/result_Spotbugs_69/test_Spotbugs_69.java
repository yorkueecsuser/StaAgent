import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantNullCheckBugTest {
    @Test
    public void testShowBug() {
        RedundantNullCheckBug buggyClass = new RedundantNullCheckBug();
        String result = buggyClass.showBug(null); // TRIGGER BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        assertNotNull(result); // This assertion will fail because showBug(null) returns null
    }
}