import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass(); // TRIGGER BUG: RequiredModifiers
        buggyClass.showBug();
    }
}