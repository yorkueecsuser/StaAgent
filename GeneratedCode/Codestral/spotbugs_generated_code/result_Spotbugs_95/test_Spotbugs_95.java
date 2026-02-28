import org.junit.Test;
import static org.junit.Assert.*;

public class BadSuiteMethodTestTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: IJU: TestCase declares a bad suite method (IJU_BAD_SUITE_METHOD)
        BadSuiteMethodTest badSuiteMethodTest = new BadSuiteMethodTest();
        badSuiteMethodTest.showBug();
    }
}