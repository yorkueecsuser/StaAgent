import org.junit.Test;
import static org.junit.Assert.*;

public class NoncompliantCodeTest {

    @Test
    public void noncompliantCodeTestBug() {
        NoncompliantCode nonCompliantCode = new NoncompliantCode();
        assertNotNull(nonCompliantCode.showBug()); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
    }
}