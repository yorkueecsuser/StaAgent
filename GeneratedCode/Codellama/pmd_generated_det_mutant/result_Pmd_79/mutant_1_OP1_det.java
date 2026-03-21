import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        short umqqzzkn = -8874;
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}