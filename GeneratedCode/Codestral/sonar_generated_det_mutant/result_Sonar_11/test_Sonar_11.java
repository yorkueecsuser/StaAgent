import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyControllerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testBuggyMethod() {
        BuggyController buggyController = new BuggyController();
        String expectedId = "123";
        String result = buggyController.showBug(expectedId);
        assertNotEquals("ID used: " + expectedId, result); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
    }
}