import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testShowBug() {
        EqualsNullBug buggyObject = new EqualsNullBug("test message");
        buggyObject.showBug(); // TRIGGER BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}