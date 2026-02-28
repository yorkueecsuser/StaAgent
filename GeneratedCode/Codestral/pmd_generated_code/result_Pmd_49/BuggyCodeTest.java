import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        Class<?> c = buggyCode.showBug();
        assertNotEquals(String.class, c); // TRIGGER BUG: InstantiationToGetClass
    }
}