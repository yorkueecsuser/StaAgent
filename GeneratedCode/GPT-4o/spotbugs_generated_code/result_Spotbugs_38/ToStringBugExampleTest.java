import org.junit.Test;
import static org.junit.Assert.*;

public class ToStringBugExampleTest {

    @Test
    public void testShowBug() {
        ToStringBugExample example = new ToStringBugExample();
        String result = example.showBug(); // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        // The expected behavior is that result should be "This is a custom string representation of the object."
        // But due to the bug, it will return something like "ToStringBugExample@<hashcode>"
        assertEquals("This is a custom string representation of the object.", result); // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    }
}