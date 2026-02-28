import org.junit.Test;
import static org.junit.Assert.*;

public class StorageExampleTest {

    @Test
    public void testShowBug() {
        StorageExample example = new StorageExample();
        String result = example.showBug(); // TRIGGER BUG: DoNotHardCodeSDCard
        assertEquals("/sdcard/mypackage", result); // This assertion will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithIncorrectPath() {
        StorageExample example = new StorageExample();
        String result = example.showBug(); // TRIGGER BUG: DoNotHardCodeSDCard
        assertEquals("/incorrect/path", result); // This assertion will fail, triggering the bug
    }
}