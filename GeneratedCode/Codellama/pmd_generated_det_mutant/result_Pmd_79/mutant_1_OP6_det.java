import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        for  (int xxyxoyvk = 0; xxyxoyvk < 0; xxyxoyvk++) {byte zjplyadt = -64;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}