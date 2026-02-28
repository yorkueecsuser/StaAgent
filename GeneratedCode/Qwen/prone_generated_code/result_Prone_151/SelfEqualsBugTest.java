import org.junit.Test;
import static org.junit.Assert.*;

public class SelfEqualsBugTest {

    @Test
    public void testShowBug() {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        assertFalse(bugDemo.showBug()); // TRIGGER BUG: SelfEquals
    }
}