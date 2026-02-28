import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.net.URL;

public class ClassLoaderExampleTest {

    @Test
    public void testShowBug() throws IOException {
        ClassLoaderExample example = new ClassLoaderExample();
        URL resource = example.showBug("example.txt"); // TRIGGER BUG: UseProperClassLoader
        assertNotNull("Resource should be found", resource);
    }
}