import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakExampleTest {

    @Test
    public void testShowBug() throws Exception {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug(); // TRIGGER BUG: Resources should be closed
    }
}