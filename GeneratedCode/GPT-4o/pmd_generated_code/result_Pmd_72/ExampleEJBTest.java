import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleEJBTest {

    @Test
    public void testShowBug() {
        ExampleEJB ejb = new ExampleEJB();
        int result = ejb.showBug(); // TRIGGER BUG: StaticEJBFieldShouldBeFinal
        assertEquals(1, result); // This assertion is expected to fail as the bug is triggered
    }

    @Test
    public void testMultipleShowBugCalls() {
        ExampleEJB ejb = new ExampleEJB();
        ejb.showBug(); // TRIGGER BUG: StaticEJBFieldShouldBeFinal
        int result = ejb.showBug(); // TRIGGER BUG: StaticEJBFieldShouldBeFinal
        assertEquals(2, result); // This assertion is expected to fail as the bug is triggered
    }
}