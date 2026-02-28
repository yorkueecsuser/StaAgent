import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionBugDemoTest {

    @Test
    public void testShowBugWithNonExistentFile() {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        assertEquals("File not found", demo.showBug("nonexistentfile.txt")); // TRIGGER BUG: AvoidLosingExceptionInformation
    }
}