import org.junit.Test;
import static org.junit.Assert.fail;
import java.io.IOException;

public class ResourceLeakExampleTest {

    @Test
    public void testShowBug1() {
        ResourceLeakExample example = new ResourceLeakExample("example.txt", new String[]{"prop1", "prop2"});
        try {
            example.showBug1(); // TRIGGER BUG: Resources should be closed
            fail("Expected IOException or resource leak issue due to unclosed resource");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testShowBug2() {
        ResourceLeakExample example = new ResourceLeakExample("example.txt", new String[]{"prop1", "prop2"});
        example.showBug2(); // TRIGGER BUG: Resources should be closed
        fail("Expected IOException or resource leak issue due to unclosed resource");
    }

    @Test
    public void testShowBug3() {
        ResourceLeakExample example = new ResourceLeakExample("example.txt", new String[]{"prop1", "prop2"});
        try {
            example.showBug3(); // TRIGGER BUG: Resources should be closed
            fail("Expected IOException or resource leak issue due to unclosed resource");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}