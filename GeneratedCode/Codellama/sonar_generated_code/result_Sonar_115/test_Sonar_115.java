import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugTest {
    @Test
    public void testTransactionalMethod1() {
        TransactionalBug transactionalBug = new TransactionalBug();
        transactionalBug.showBug();
        // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
        assertEquals(1, transactionalBug.getTransactionalMethod1Called());
    }

    @Test
    public void testTransactionalMethod2() {
        TransactionalBug transactionalBug = new TransactionalBug();
        transactionalBug.showBug();
        // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
        assertEquals(1, transactionalBug.getTransactionalMethod2Called());
    }

    @Test
    public void testShowBug() {
        TransactionalBug transactionalBug = new TransactionalBug();
        transactionalBug.showBug();
        // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
        assertEquals(1, transactionalBug.getShowBugCalled());
    }
}