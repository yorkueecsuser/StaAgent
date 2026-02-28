import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ResourceLeakExampleTest {

    @Test(expected = IOException.class)
    public void testShowBug1() throws IOException {
        ResourceLeakExample example = new ResourceLeakExample("testfile.txt", Arrays.asList("property1", "property2"));
        example.showBug("testfile.txt", Arrays.asList("property1", "property2")); // TRIGGER BUG: Resources should be closed
    }

    @Test(expected = IOException.class)
    public void testShowBug2() throws IOException {
        ResourceLeakExample example = new ResourceLeakExample("testfile.txt", Arrays.asList("property1", "property2"));
        example.showBug("testfile.txt", Arrays.asList("property1", "property2")); // TRIGGER BUG: Resources should be closed
    }

    @Test(expected = IOException.class)
    public void testShowBug3() throws IOException {
        ResourceLeakExample example = new ResourceLeakExample("testfile.txt", Arrays.asList("property1", "property2"));
        example.showBug("testfile.txt", Arrays.asList("property1", "property2")); // TRIGGER BUG: Resources should be closed
    }
}