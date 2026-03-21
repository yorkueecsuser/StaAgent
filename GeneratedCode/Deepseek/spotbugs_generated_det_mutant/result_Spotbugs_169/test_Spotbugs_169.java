import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test // TRIGGER BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    public void testShowBug() {
        int result = BuggyCode.showBug();
        // This assertion should fail because the 'rand.nextInt()' produces a side effect
        assertTrue("The result is greater than zero", result > 0);
    }
}