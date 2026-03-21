import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MutableServletTest {

    @Test
    // TRIGGER BUG: Servlets should not have mutable instance fields
    public void testShowBug() {
        MutableServlet servlet = new MutableServlet();
        List<String> mutableField = servlet.showBug();

        // Assert that the mutableField is not empty
        assertNotNull("Mutable field should not be null", mutableField);
        assertFalse("Mutable field should not be empty", mutableField.isEmpty());
    }
}