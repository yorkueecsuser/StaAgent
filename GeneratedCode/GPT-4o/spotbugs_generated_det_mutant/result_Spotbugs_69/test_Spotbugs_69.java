import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantNullCheckExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        example.showBug(null); // TRIGGER BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
    }
    
    @Test
    public void testShowBugWithNonNullInput() {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        String result = example.showBug("Hello");
        assertEquals("Input string length is: 5", result);
    }
}