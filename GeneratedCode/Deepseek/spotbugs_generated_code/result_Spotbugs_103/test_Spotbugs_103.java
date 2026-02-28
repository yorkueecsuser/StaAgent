import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryTypeCheckTest {
    @Test
    public void testShowBug() {
        UnnecessaryTypeCheck unnecessaryTypeCheck = new UnnecessaryTypeCheck();
        String result = (String) unnecessaryTypeCheck.showBug("test"); // TRIGGER BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
        assertEquals("TEST", result);
    }
}