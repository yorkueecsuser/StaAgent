import org.junit.Test;
import static org.junit.Assert.*;

public class PrintfStyleBugsTest {

    @Test
    public void testShowBug() {
        PrintfStyleBugs bugs = new PrintfStyleBugs();
        bugs.showBug(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}