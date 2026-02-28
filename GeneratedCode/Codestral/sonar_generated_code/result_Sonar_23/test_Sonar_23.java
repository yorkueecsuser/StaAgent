import org.junit.Test;
import static org.junit.Assert.*;

public class CastBugTest {
    @Test
    public void testShowBug() {
        CastBug buggyClass = new CastBug();
        String input = "This is a string";
        buggyClass.showBug(input);  // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    }
}