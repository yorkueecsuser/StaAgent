import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BuggyAssertionTest {
    @Test
    public void testShowBug() {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("World", "Bug");
        buggyAssertion.showBug(list); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}