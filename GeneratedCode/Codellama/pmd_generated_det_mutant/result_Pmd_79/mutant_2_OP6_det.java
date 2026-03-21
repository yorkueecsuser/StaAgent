import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        for  (int pteqghib = 0; pteqghib < 0; pteqghib++) {double knsmpgpb = -144715291;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}