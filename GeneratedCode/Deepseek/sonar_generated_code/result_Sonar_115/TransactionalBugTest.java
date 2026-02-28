import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugTest {

    private TransactionalBug bug = new TransactionalBug();

    @Test(expected = IllegalStateException.class)
    public void testShowBug() {
        bug.showBug(); // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    }
}