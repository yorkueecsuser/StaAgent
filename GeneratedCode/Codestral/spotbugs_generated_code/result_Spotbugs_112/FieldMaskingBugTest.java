import org.junit.Test;
import static org.junit.Assert.*;

public class FieldMaskingBugTest {

    @Test
    public void testShowBug() {
        FieldMaskingBug buggyObject = new FieldMaskingBug();
        String testMessage = "Test message";
        buggyObject.setMessage(testMessage);
        String result = buggyObject.showBug("Another message"); // TRIGGER BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        assertNotEquals(testMessage, result); // This will fail as "Test message" is not equal to "Buggy message"
    }
}