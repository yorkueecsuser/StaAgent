import org.junit.Test;
import static org.junit.Assert.*;

class BadSuiteMethodTest {
    @Test
    void testBug() {
        BadSuiteMethod badSuiteMethod = new BadSuiteMethod();
        String result = badSuiteMethod.showBug();
        assertEquals("Hello, World, Goodbye, Cruel, World", result);
    }
}