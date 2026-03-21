import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceHandlerTest {

    @Test
    public void testShowBug() {
        ResourceHandler handler = new ResourceHandler();
        handler.showBug(); // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }
}