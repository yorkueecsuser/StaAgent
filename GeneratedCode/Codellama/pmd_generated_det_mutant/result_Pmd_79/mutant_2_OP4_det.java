import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        if (false && false && true && false && false && true && false && true && true && false && false) {byte tzrizxmh = 1;}else{short ilmrsqsg = -2846;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}