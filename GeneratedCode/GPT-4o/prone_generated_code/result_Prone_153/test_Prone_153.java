import org.junit.Test;
import static org.junit.Assert.*;

public class ArgumentCheckerTest {

    @Test
    public void testShowBug() {
        ArgumentChecker checker = new ArgumentChecker();
        checker.showBug(); // TRIGGER BUG: ShouldHaveEvenArgs
        fail("Expected the bug to be triggered due to odd number of arguments"); // TRIGGER BUG: ShouldHaveEvenArgs
    }
}