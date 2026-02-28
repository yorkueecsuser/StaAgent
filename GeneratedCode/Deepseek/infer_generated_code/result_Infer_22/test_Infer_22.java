import org.junit.Test;
import static org.junit.Assert.*;

public class MutualRecursionCycleBugTest {

    MutualRecursionCycleBug bug = new MutualRecursionCycleBug();

    @Test
    // TRIGGER BUG: MUTUAL_RECURSION_CYCLE
    public void testShowBug() {
        int result = bug.showBug();
    }
}