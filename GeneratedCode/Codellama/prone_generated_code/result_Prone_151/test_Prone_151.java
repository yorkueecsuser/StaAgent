import org.junit.Test;
import static org.junit.Assert.*;

public class SelfEqualsTest {
    @Test
    public void testShowBug() {
        String str = SelfEquals.showBug();
        assertFalse(str.equals(str)); // TRIGGER BUG: SelfEquals
    }
}