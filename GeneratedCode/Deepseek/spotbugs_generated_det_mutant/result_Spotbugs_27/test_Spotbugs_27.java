import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testBug() {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug();
    }
}