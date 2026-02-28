import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testMethod() {
        BugExample example = new BugExample();
        example.showBug(); // TRIGGER BUG: UnusedNullCheckInEquals
    }
}