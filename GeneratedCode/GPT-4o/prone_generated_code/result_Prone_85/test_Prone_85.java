import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceCheckTest {

    @Test
    public void testShowBug() {
        InstanceCheck instanceCheck = new InstanceCheck();
        assertTrue(instanceCheck.showBug()); // TRIGGER BUG: IsInstanceIncompatibleType
    }
}