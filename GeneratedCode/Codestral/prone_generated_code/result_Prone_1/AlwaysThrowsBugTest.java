import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysThrowsBugTest {
    @Test
    public void testShowBugWithZero() {
        AlwaysThrowsBug buggyObject = new AlwaysThrowsBug();
        buggyObject.showBug(0); // TRIGGER BUG: AlwaysThrows
    }

    @Test
    public void testShowBugWithNegativeNumber() {
        AlwaysThrowsBug buggyObject = new AlwaysThrowsBug();
        buggyObject.showBug(-5); // TRIGGER BUG: AlwaysThrows
    }
}