import org.junit.Test;
import static org.junit.Assert.*;

public class StoragePathExampleTest {

    @Test
    public void testShowBug() {
        StoragePathExample example = new StoragePathExample();
        String result = example.showBug();
        assertEquals("/sdcard/mypackage", result); // TRIGGER BUG: DoNotHardCodeSDCard
    }
}