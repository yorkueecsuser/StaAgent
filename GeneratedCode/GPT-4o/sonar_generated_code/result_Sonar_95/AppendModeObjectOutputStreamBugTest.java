import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.StreamCorruptedException;

public class AppendModeObjectOutputStreamBugTest {

    @Test
    public void testShowBug() {
        AppendModeObjectOutputStreamBug obj = new AppendModeObjectOutputStreamBug();
        String filename = "testfile.dat";
        
        // Attempt to show the bug
        obj.showBug(filename); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        
        try {
            // Attempt to read back objects to verify corruption
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            AppendModeObjectOutputStreamBug.ExampleObject obj1 = (AppendModeObjectOutputStreamBug.ExampleObject) ois.readObject();
            AppendModeObjectOutputStreamBug.ExampleObject obj2 = (AppendModeObjectOutputStreamBug.ExampleObject) ois.readObject();
            ois.close();

            // If we reach this point without an exception, the test should fail
            fail("Expected StreamCorruptedException was not thrown"); // The test should fail here
        } catch (StreamCorruptedException e) {
            // Expected outcome, test passes
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Cleanup
        new File(filename).delete();
    }
}