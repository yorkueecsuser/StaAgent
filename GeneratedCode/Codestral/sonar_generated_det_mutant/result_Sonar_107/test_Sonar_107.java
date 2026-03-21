import org.junit.Test;
import static org.junit.Assert.*;

public class PropfStyleFormatStringBugTest {
    @Test
    public void testShowBug() {
        PropfStyleFormatStringBug bug = new PropfStyleFormatStringBug();
        bug.showBug();
        // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        // The above line calls the showBug method which contains printf-style format strings with errors
    }
}