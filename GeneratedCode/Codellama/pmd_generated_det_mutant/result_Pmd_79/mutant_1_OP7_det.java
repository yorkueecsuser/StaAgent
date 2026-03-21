import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        boolean oktncyhl = false;while (oktncyhl && false && true && true && true && false && false && false && true && true && false && false) {boolean qolaspec = false;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}