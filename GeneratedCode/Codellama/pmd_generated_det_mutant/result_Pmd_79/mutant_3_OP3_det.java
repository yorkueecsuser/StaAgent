import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        if (true && true && true && true && true && true && true && false && true && false && false) {double mwagwwia = -187008612;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}