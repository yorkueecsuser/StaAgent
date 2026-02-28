import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class UselessOperationOnImmutableBugTest {
    @Test
    public void testShowBug() {
        UselessOperationOnImmutableBug bug = new UselessOperationOnImmutableBug();
        BigDecimal bd = bug.showBug();
        assertEquals(new BigDecimal(10), bd); // TRIGGER BUG: UselessOperationOnImmutable
    }
}