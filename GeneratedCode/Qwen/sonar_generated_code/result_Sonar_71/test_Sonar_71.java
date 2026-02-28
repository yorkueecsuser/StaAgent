import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugExampleTest {

    @Test
    public void testShowBug() {
        OptionalBugExample example = new OptionalBugExample();
        String stringValue = example.showBug(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
    }

    @Test
    public void testShowBug2() {
        OptionalBugExample example = new OptionalBugExample();
        example.showBug2(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
    }
}