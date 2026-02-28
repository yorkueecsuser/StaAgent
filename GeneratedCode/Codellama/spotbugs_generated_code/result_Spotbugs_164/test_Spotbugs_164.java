import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class GeneratedBuggyCodeTest {
    @Test
    public void testFileFound() {
        String path = "./target/classes/file.txt";
        File file = new File(path);
        assertTrue(file.isFile());
    }
    
    @Test
    public void testFileNotFound() {
        String path = "./target/classes/non-existent.txt";
        File file = new File(path);
        assertTrue(file.isFile());
    }
    
    @Test
    public void testPathTraversal() {
        String path = "./../../../etc/passwd";
        File file = new File(path);
        assertTrue(file.isFile());
    }
}