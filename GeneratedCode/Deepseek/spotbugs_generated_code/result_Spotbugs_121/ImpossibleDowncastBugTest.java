import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleDowncastBugTest {
    @Test
    public void testShowBug() {
        ImpossibleDowncastBug buggyCode = new ImpossibleDowncastBug();
        buggyCode.showBug();
        // TRIGGER BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        // The bug is triggered in the showBug() method, which attempts to downcast an Object to a String.
        // This will always throw a ClassCastException. Since we are not expecting this exception,
        // the test case will fail, demonstrating the bug.
    }
}