import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class FileLockExampleTest {

    @Test
    public void testShowBug() {
        FileLockExample example = new FileLockExample();
        File file = new File("dummy.txt");
        
        example.showBug(file); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }
}