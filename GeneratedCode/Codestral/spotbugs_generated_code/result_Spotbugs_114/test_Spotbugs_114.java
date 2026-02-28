import org.junit.Test;
import static org.junit.Assert.*;

public class NaNCheckerTest {
    @Test
    public void testShowBug() {
        NaNChecker checker = new NaNChecker();
        assertTrue(checker.showBug(Double.NaN)); // TRIGGER BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
    }
}