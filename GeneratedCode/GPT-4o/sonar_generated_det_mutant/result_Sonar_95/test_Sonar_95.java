import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class AppendModeWithObjectOutputStreamTest {

    @Test
    public void testShowBug() {
        AppendModeWithObjectOutputStream object1 = new AppendModeWithObjectOutputStream("First Message");
        AppendModeWithObjectOutputStream object2 = new AppendModeWithObjectOutputStream("Second Message");
        String fileName = "testfile.bin";

        object1.showBug(fileName, object1); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        object2.showBug(fileName, object2); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"

        // Try reading the objects back
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
             
            assertEquals("First Message", ((AppendModeWithObjectOutputStream) ois.readObject()).getMessage());
            assertEquals("Second Message", ((AppendModeWithObjectOutputStream) ois.readObject()).getMessage());
        } catch (StreamCorruptedException e) {
            fail("StreamCorruptedException triggered due to appending with ObjectOutputStream");
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected exception occurred");
        }
    }
}