import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugTest {

    @Test
    public void testShowBug() {
        TransactionalBug buggyObject = new TransactionalBug();
        // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
        buggyObject.showBug();
    }
}