import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testToStringMethod() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.showBug();  // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    }
}