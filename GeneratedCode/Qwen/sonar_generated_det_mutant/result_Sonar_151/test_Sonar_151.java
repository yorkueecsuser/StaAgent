import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class ResourceLeakExampleTest {

    @Test
    public void testResourceLeaks() throws IOException {
        ResourceLeakExample example = new ResourceLeakExample("testfile.txt", List.of("prop1", "prop2"));
        example.showBug(); // TRIGGER BUG: Resources should be closed
    }
}