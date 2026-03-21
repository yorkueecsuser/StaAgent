import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceControllerTest {

    @Test
    public void testShowBug() {
        ResourceController controller = new ResourceController();
        controller.showBug("123"); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
    }
}