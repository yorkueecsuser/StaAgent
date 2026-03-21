import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        if (true && false && true && true && true && true && true && false && false && true && false) {boolean gurwlcju = false;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}