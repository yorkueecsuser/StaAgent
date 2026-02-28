import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldDemoTest {

    @Test
    public void testShowBug() {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        int result = demo.showBug(); // TRIGGER BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        assertNotEquals("The unwrittenField should not equal the default value of 0.", 0, result); // TRIGGER BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    }
}