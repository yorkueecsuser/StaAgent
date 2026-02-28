import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BuggyCodeTest {

    @Test
    public void testDoTheThing() {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = new ArrayList<>();
        strings.add("test");
        assertNotEquals("initial", buggyCode.showBug("initial", 5, strings)); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }
}