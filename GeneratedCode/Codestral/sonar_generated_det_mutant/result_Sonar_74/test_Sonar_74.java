import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;

public class BuggyResourceClosingTest {

    @Test
    public void testReadFile() {
        BuggyResourceClosing buggy = new BuggyResourceClosing();
        try {
            // TRIGGER BUG: Custom resources should be closed
            buggy.showBug("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            // The exception is expected because we are trying to read a non-existent file
        }
    }
}