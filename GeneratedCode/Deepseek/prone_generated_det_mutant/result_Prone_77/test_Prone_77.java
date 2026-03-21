import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    private BuggyClass buggyClass = new BuggyClass();

    @Test
    public void testShowBug() {
        buggyClass.showBug();
    }
}