import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class ResourceLeakBugTest {

    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        ResourceLeakBug.showBug(); // TRIGGER BUG: RESOURCE_LEAK
    }
}