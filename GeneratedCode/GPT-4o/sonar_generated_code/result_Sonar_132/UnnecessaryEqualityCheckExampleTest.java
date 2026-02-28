import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryEqualityCheckExampleTest {

    @Test
    public void testShowBug() {
        UnnecessaryEqualityCheckExample example = new UnnecessaryEqualityCheckExample();
        
        boolean result = example.showBug(); // TRIGGER BUG: Unnecessary equality checks should not be made
        assertFalse("The bug should be triggered due to unnecessary equality checks.", result);
    }
}