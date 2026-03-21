import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        boolean caxqvwji = false;while (caxqvwji && true && true && true && false && false && false && false && true && true && true && false) {String eavxtyit = "vsqdctgv";}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}