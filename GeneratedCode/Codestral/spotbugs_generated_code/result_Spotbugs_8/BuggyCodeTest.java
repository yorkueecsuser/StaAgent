import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class BuggyCodeTest {
    @Test(expected = StackOverflowError.class)
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        HashSet<Object> buggySet = buggyCode.showBug(); // TRIGGER BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        buggySet.hashCode(); // This line will trigger StackOverflowError
    }
}