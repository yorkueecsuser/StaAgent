import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        boolean zdlcbevg = false;
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}