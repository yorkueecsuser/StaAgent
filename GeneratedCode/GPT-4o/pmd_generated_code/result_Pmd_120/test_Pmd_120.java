import org.junit.Test;
import static org.junit.Assert.*;

public class FileItemExampleTest {

    @Test
    public void testShowBug() {
        MyFileItem fileItem = new MyFileItem();
        String result = new FileItemExample().showBug(fileItem); // TRIGGER BUG: UseIOStreamsWithApacheCommonsFileItem
        // The test should fail due to memory exhaustion potential in `showBug`
        // Here we assert for null, but the key is to trigger the bug
        assertNotNull(result); // The test is designed to fail due to the bug
    }
}