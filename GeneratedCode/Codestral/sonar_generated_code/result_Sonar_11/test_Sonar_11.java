import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyControllerTest {
    @Test
    public void testGetResource() {
        BuggyController buggyController = new BuggyController();
        String expectedId = "123";
        String expectedResult = "Resource with id: " + expectedId;

        // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        String actualResult = buggyController.getResource(expectedId);

        // The test should fail here because the getResource method does not use the @PathVariable annotation
        assertEquals(expectedResult, actualResult);
    }
}