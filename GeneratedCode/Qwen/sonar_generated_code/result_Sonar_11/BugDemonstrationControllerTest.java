import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationControllerTest {

    @Test
    public void testGetResourceByIdWithoutPathVariable() {
        BugDemonstrationController controller = new BugDemonstrationController();
        String result = controller.showBug("123"); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        assertEquals("Resource ID: 123", result); // This assertion will fail because the id is not correctly bound
    }
}