import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        for  (int wunnzjqs = 0; wunnzjqs < 0; wunnzjqs++) {short wisxdolb = -4717;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}