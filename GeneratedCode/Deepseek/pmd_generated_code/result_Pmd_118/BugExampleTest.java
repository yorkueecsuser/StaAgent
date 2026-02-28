import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints); // This line triggers the bug // TRIGGER BUG: UseArraysAsList
    }
}