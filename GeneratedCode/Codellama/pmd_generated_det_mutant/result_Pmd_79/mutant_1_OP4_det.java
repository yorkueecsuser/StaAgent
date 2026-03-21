import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        if (false && false && false && false && false && false && false && true && false && true && false) {double yozhutmh = -823485832;}else{short qckrzslx = -5156;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}