import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        if (true && true && true && true && false && true && true && true && false && true && false) {short civpajvz = 255;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}