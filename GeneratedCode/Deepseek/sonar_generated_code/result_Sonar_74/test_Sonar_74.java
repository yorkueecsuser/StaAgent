import org.junit.Test;
import static org.junit.Assert.*;

public class CustomResourcesTest {
    @Test
    public void testShowBug() {
        CustomResources cr = new CustomResources();
        cr.showBug(); // TRIGGER BUG: Custom resources should be closed
        fail("Failed to trigger bug"); // This line will never be reached if bug is not triggered
    }
}