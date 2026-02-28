import org.junit.Test;
import java.io.IOException;

public class ResourceLeakExampleTest {

    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug();  // TRIGGER BUG: RESOURCE_LEAK
    }

    @Test(expected = IOException.class)
    public void testShowBug2() throws IOException {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug2();  // TRIGGER BUG: RESOURCE_LEAK
    }
}