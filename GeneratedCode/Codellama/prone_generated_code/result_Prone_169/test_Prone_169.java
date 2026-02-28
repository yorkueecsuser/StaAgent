import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryCheckNotNullTest {
    @Test
    public void testBug() {
        UnnecessaryCheckNotNull ucn = new UnnecessaryCheckNotNull();
        // TRIGGER BUG: UnnecessaryCheckNotNull
        ucn.showBug(null);
    }
}