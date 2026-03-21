import org.junit.Test;
import static org.junit.Assert.*;

class InefficientEmptyStringCheckTest {
    @Test
    public void testBug() {
        String str = "  ";
        assertEquals(0, str.trim().length()); // TRIGGER BUG: InefficientEmptyStringCheck
    }
}