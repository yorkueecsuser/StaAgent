import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bug = new BugExample(5);
        bug.showBug();  // TRIGGER BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    }
}