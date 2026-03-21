import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousOctalEscapeTest {
    @Test
    public void testSuspiciousOctalEscape() {
        // TRIGGER BUG: SuspiciousOctalEscape
        String testString = "\038";
        System.out.println(testString);
    }
}