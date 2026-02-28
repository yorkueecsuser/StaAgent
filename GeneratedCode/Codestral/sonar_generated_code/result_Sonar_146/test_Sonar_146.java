import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BuggyCollectionExampleTest {
    @Test
    public void testShowBug() {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
        // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        // The bug is triggered as the showBug method adds a List to itself
    }
}