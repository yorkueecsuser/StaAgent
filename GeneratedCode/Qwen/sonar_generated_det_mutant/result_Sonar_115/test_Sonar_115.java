import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugExampleTest {

    @Test
    public void testShowBug() {
        TransactionalBugExample example = new TransactionalBugExample();
        assertEquals("An error occurred: null", example.showBug()); // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    }
}