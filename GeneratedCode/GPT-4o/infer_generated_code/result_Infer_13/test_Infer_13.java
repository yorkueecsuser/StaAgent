import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourceLeakExampleTest {

    @Test
    public void testShowBug() {
        ResourceLeakExample example = new ResourceLeakExample();
        String result = example.showBug(); // TRIGGER BUG: RESOURCE_LEAK
        assertEquals("Write successful", result); // This assertion should fail if the bug is triggered
    }
}