import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalAccessBugTest {

    @Test
    public void testShowBug() {
        OptionalAccessBug bugInstance = new OptionalAccessBug();
        String result = bugInstance.showBug(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
    }
}