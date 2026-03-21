import org.junit.Test;
import static org.junit.Assert.*;

public class ReaderExampleTest {

    @Test
    public void testShowBug() {
        ReaderExample example = new ReaderExample();
        example.showBug("example.txt"); // TRIGGER BUG: "read" and "readLine" return values should be used
        fail("The bug should cause this test to fail because the return value of readLine is not being used.");
    }
}