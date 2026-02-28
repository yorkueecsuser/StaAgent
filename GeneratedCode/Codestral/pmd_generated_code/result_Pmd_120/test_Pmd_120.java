import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class FileUploadServletTest {

    @Test
    public void testShowBug() throws IOException {
        FileUploadServlet servlet = new FileUploadServlet();
        // TRIGGER BUG: Using getString() could exhaust memory as it loads the entire file into memory.
        servlet.showBug();
    }
}