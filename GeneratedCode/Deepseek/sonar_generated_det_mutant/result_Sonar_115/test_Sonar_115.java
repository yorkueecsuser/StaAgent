import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugTest {
    @Test
    public void testBug() {
        TransactionalBug bug = new TransactionalBug();
        bug.showBug(); // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    }
}