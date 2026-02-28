import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalExampleTest {

    @Test
    public void testShowBug() {
        TransactionalExample example = new TransactionalExample();
        example.showBug(); // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    }
}