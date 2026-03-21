import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugTest {
    @Test
    public void showBugTest() {
        TransactionalBug tb = new TransactionalBug();
        tb.showBug(); // This line triggers the bug
    }
}