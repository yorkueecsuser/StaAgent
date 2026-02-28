import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    private BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testFunc() {
        buggyCode.showBug(); // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
    }
}