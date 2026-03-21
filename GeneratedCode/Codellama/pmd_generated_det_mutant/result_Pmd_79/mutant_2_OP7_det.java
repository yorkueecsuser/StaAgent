import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        boolean ivtvckbi = false;while (ivtvckbi && false && false && true && true && true && true && true && true && true && false && false) {double xxuhnxjs = 251391710;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}