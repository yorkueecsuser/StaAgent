import org.junit.Test;
import static org.junit.Assert.*;

public class FileStreamBugDemoTest {

    @Test
    public void testShowBug() {
        FileStreamBugDemo demo = new FileStreamBugDemo();
        String result = demo.showBug("non_existent_file.txt"); // TRIGGER BUG: AvoidFileStream
        assertTrue(result.startsWith("Error:")); // This assertion will fail if bug is triggered
    }

    @Test
    public void testShowBug2() {
        FileStreamBugDemo demo = new FileStreamBugDemo();
        demo.showBug2("test_output.txt", "This is a test."); // TRIGGER BUG: AvoidFileStream
        // Assertion not needed as IOException should be thrown, causing test failure
    }

    @Test
    public void testShowBug3() {
        FileStreamBugDemo demo = new FileStreamBugDemo();
        String result = demo.showBug3("non_existent_file.txt"); // TRIGGER BUG: AvoidFileStream
        assertTrue(result.startsWith("Error:")); // This assertion will fail if bug is triggered
    }

    @Test
    public void testShowBug4() {
        FileStreamBugDemo demo = new FileStreamBugDemo();
        demo.showBug4("test_output.txt", "This is another test."); // TRIGGER BUG: AvoidFileStream
        // Assertion not needed as IOException should be thrown, causing test failure
    }
}