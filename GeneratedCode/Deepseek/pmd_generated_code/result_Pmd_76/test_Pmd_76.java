import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousOctalEscapeTest {
    @Test
    public void testShowBug() {
        SuspiciousOctalEscape.showBug();
        // TRIGGER BUG: SuspiciousOctalEscape
    }
}