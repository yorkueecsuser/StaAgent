import org.junit.Test;
import static org.junit.Assert.*;

public class StringBugExampleTest {
    @Test
    public void testShowBug() {
        StringBugExample.showBug(); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }
}