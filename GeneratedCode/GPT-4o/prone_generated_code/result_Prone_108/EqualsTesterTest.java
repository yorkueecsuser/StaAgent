import org.junit.Test;

public class EqualityCheckerTest {

    @Test
    public void testShowBug() {
        EqualityChecker checker = new EqualityChecker();
        checker.showBug(); // TRIGGER BUG: MissingTestCall
    }
}